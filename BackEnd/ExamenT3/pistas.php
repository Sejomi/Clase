<?php

$pistas = [
    "PA01" => ["nombre" => "Pádel 1", "tipo" => "padel", "precioHora" => 12.00, "disponible" => true],

    "PA02" => ["nombre" => "Pádel 2", "tipo" => "padel", "precioHora" => 12.00, "disponible" => false],

    "TE01" => ["nombre" => "Tenis 1", "tipo" => "tenis", "precioHora" => 10.00, "disponible" => true],

    "FS01" => ["nombre" => "Fútbol Sala", "tipo" => "futbol", "precioHora" => 25.00, "disponible" => true],

    "TE02" => ["nombre" => "Tenis 2", "tipo" => "tenis", "precioHora" => 10.00, "disponible" => false],
];

function pistasDisponibles (array $pistas): array {
    return array_filter($pistas, fn($p) => $p['disponible'] === true, 0);
}

function pistasPorTipo (array $pistas, string $tipo): array {
    return array_filter($pistas, fn ($p) => $p['tipo'] === $tipo, 0);
}

function clasificarPrecio (float $precio): string {
    return match (true) {
        $precio < 10 => 'económica',
        $precio <= 20 => 'estándar',
        default => 'premium'
    };
}

function aplicarDescuento (array $pistas, float $porcentaje): array {
    return array_map(function ($p) use ($porcentaje) {
        $arrayMod = $p;
        $arrayMod['precioHora'] *= (1 - $porcentaje / 100);
        return $arrayMod;
    }, $pistas);
}

print_r(pistasDisponibles($pistas));
print_r(pistasPorTipo($pistas, 'padel'));
echo(clasificarPrecio(10));
print_r(aplicarDescuento($pistas, 67));
?>