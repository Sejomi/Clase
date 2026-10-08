<?php
$almacenes = [
    "Madrid" => [
        ["producto" => "Portátil", "precio" => 600.0, "stock" => 4],
        ["producto" => "Tablet",   "precio" => 250.0, "stock" => 1],
    ],
    "Valencia" => [
        ["producto" => "Monitor",  "precio" => 180.0, "stock" => 8],
        ["producto" => "Teclado",  "precio" => 25.0,  "stock" => 2],
    ],
];

// a) $almacenesActualizados: precios +10%, sin modificar $almacenes
//    Usa array_map anidado (uno por almacén, uno por producto)
$almacenesActualizados = array_map(function ($c) {
    return array_map(function ($p) {
        $p["precio"] *= 1.1;
        return $p;
        }, $c)
    }, $almacenes);

// b) $stockBajo: solo productos con stock <= 2, manteniendo estructura por almacén
//    Usa array_map + array_filter
$stockBajo = // Tu código aquí

print_r($almacenesActualizados);
print_r($stockBajo);
?>