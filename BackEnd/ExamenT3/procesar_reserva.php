<?php
require __DIR__ . '/pistas.php';

function validarReserva (array $datos, array $pistasDisponibles): array {
    $errores = [];

    $nombre = trim($datos['nombre'] ?? '');
    $email = trim($datos['email'] ?? '');
    $pista = trim($datos['pista'] ?? '');
    $fecha = trim($datos['fecha'] ?? '');
    $hora = trim($datos['hora'] ?? '');
    // $file = $datos['comprobante'] ?? null;

    if ($nombre === '') { $errores[] = 'El nombre no puede estar vacío.'; }
    if ($email === '' || !filter_var($email, FILTER_VALIDATE_EMAIL)) { $errores[] = 'El email esta vacío o es inválido.'; }
    if (!array_key_exists($pista, $pistasDisponibles)) { $errores[] = 'La pista no existe.'; }
    if ($fecha === '') { $errores[] = 'La fecha no puede estar vacía.'; }
    if ($hora === '') { $errores[] = 'La hora es errónea o esta vacía.'; } //  || preg_match('')

    return $errores;
}

function calcularPrecioTotal (float $precioHora, int $horas, float $descuento = 0): float {
    return $precioHora * $horas * (1 - $descuento / 100);
}

//  if (empty(validarReserva($_POST, pistasDisponibles($pistas)))) {
//  
//  }

?>