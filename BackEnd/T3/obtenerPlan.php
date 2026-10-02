<?php
$datos = [
    'A' => ["nombre" => "Básico", "precio" => 9.99, "gb" => 10],
    'B' => ["nombre" => "Estándar", "precio" => 19.99, "gb" => 50],
    'C' => ["nombre" => "Premium", "precio" => 29.99, "gb" => 100],
    'D' => ["nombre" => "Premium", "precio" => 29.99, "gb" => 100]
];

$plan = 'A';
print_r(obtenerPlan($plan));

function obtenerPlan(string $codigo) : array {
    global $datos;
    global $plan;
    try {
        $check = match ($plan) {
            'A', 'B', 'C', 'D'=> $datos[$plan],
            };
        } catch (UnhandledMatchError $e) {
            echo "No se reconoce el plan: $plan";
        }
        return $check;
    }
?>