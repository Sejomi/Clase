<?php
$nombres = ["Enrique", "Hugo", "Dylan", "Gorgue"];

$numNombres = count($nombres);
$nombresJuntos = implode(" ", $nombres);
//asort($nombres);
$nombresInvertido = array_reverse($nombres);
$miNombre = array_search("Dylan", $nombres);

print_r($miNombre);