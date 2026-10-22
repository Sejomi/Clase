<?php
$catalogo = [
    "P001" => ["nombre" => "Camiseta",   "precio" => 15.99, "stock" => 20, "categoria" => "ropa"],
    "P002" => ["nombre" => "Pantalón",   "precio" => 39.99, "stock" => 0,  "categoria" => "ropa"],
    "P003" => ["nombre" => "Zapatillas", "precio" => 59.99, "stock" => 5,  "categoria" => "calzado"],
    "P004" => ["nombre" => "Calcetines", "precio" => 4.99,  "stock" => 50, "categoria" => "ropa"],
    "P005" => ["nombre" => "Mochila",    "precio" => 29.99, "stock" => 3,  "categoria" => "accesorios"],
    "P006" => ["nombre" => "Cinturón",   "precio" => 12.99, "stock" => 0,  "categoria" => "accesorios"],
];

/**
 * Devuelve solo los productos disponibles (stock > 0).
 * Usa array_filter. No modifica el catálogo original.
 * @param array $catalogo
 * @return array
 */
function productosDisponibles(array $catalogo): array {
    return array_filter($catalogo, fn($v) => $v["stock"] > 0);
}

/**
 * Devuelve los productos de una categoría concreta.
 * Usa array_filter. No modifica el catálogo original.
 * @param array  $catalogo
 * @param string $categoria
 * @return array
 */
function productosPorCategoria(array $catalogo, string $categoria): array {
    return array_filter($catalogo, fn($v) => $v["categoria"] === $categoria);
}

/**
 * Aplica un porcentaje de descuento al precio de todos los productos.
 * Usa array_map. Devuelve un nuevo array sin modificar el original.
 * @param array $catalogo
 * @param float $porcentaje  Valor entre 0 y 100
 * @return array
 */
function aplicarDescuento(array $catalogo, float $porcentaje): array {
    return array_map(fn($v) => $v["precio"] * (1 - $porcentaje / 100), $catalogo);
}

/**
 * Calcula el valor total del inventario (precio × stock de cada producto).
 * Usa array_reduce.
 * @param array $catalogo
 * @return float
 */
function valorInventario(array $catalogo): float {
    return array_reduce($catalogo, fn($acum, $v) => $acum + $v["precio"], 0);
}

/**
 * Clasifica un producto según su precio.
 * < 10 €     → "económico"
 * 10–29.99 € → "estándar"
 * 30–59.99 € → "premium"
 * >= 60 €    → "lujo"
 * @param float $precio
 * @return string
 */
function clasificarPrecio(float $precio): string {
    return match(true) {
        $precio < 10 => "económico",
        $precio >= 10 => "estándar",
        $precio >= 30 => "premium",
        $precio >= 60 => "lujo"
    };
}
?>