<?php
require __DIR__ . '/catalogo.php';


// 1. RECOGER DATOS
$nombre = trim($_POST['nombre'] ?? '');
$email = trim($_POST['email'] ?? '');
$pedido = trim($_POST['referencia'] ?? '');
$cantidad = $_POST['cantidad'] ?? null;
$codDescuento = trim($_POST['descuento'] ?? '');
$descuento = 0;

// 2. VALIDAR
$errores = [];

if ($nombre === '') {
    $errores[] = "El nombre es obligatorio.";
}

if ($email === '' || !filter_var($email, FILTER_VALIDATE_EMAIL)) {
    $errores[] = "El email es inválido";
}

if ($pedido === '') {
    $errores[] = "El pedido no puede estar vacío";
}
if (!array_key_exists($pedido, $catalogo)) {
    $errores[] = "No se encuentra el número de pedido";
}
if ($cantidad === null || !filter_var($cantidad, FILTER_VALIDATE_INT)) {
    $errores[] = "La cantidad no es válida";
}

// 3. CALCULAR DESCUENTO POR CÓDIGO
match ($codDescuento) {
    "VERANO10" => $descuento = 10,
    "BLACK20" => $descuento = 20,
    '' => 0,
    default => $errores[] = "Código de descuento no válido"
};

// 4. MOSTRAR RESULTADO
if (empty($errores)) {
    $producto    = $catalogo[$pedido];
    $precioFinal = $producto['precio'] * (1 - $descuento / 100);
    $total       = $precioFinal * (int)$cantidad;

    $nombreSeguro  = htmlspecialchars($nombre,             ENT_QUOTES, 'UTF-8');
    $emailSeguro   = htmlspecialchars($email,              ENT_QUOTES, 'UTF-8');
    $productoSeguro = htmlspecialchars($producto['nombre'], ENT_QUOTES, 'UTF-8');

    echo "¡Pedido confirmado!<br>\n";
    echo "Cliente: $nombreSeguro ($emailSeguro)<br>\n";
    echo "Producto: $productoSeguro (ref. $pedido)<br>\n";
    echo "Cantidad: $cantidad × " . number_format($precioFinal, 2, ',', '.') . " € = "
       . number_format($total, 2, ',', '.') . " €<br>\n";
    if ($descuento > 0) {
        echo "Descuento aplicado: $descuento%<br>\n";
    }
} else {
    foreach ($errores as $e) {
        echo "Error: " . htmlspecialchars($e, ENT_QUOTES, 'UTF-8') . "<br>\n";
    }
}
?>