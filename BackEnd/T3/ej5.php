<?php
$catalogo = [
    "4021"  => "Desarrollo de Aplicaciones Web",
    "1103"  => "Desarrollo de Aplicaciones Multiplataforma",
    "3350" => "Administración de Sistemas Informáticos en Red",
    "2287"  => "Sistemas Microinformáticos y Redes",
];

function buscarCurso(array $catalogo, string $codigo): ?string {
    // Devuelve el nombre si existe, null si no
    return array_key_exists($codigo, $catalogo) ? $catalogo[$codigo] : null;
}

function existeCurso(array $catalogo, string $nombre): bool {
    // true si el nombre existe como valor (usa in_array estricto)
    return in_array($nombre, $catalogo, true);
}

// Pruebas
var_dump(buscarCurso($catalogo, "4021"));        // string "Desarrollo de Aplicaciones Web"
var_dump(buscarCurso($catalogo, "9999"));         // NULL
var_dump(existeCurso($catalogo, "Redes"));        // false (nombre parcial)
var_dump(existeCurso($catalogo, "Sistemas Microinformáticos y Redes")); // true

// Muestra el catálogo ordenado por código y luego por nombre
?>