<?php
class Vehiculo {
    private String $id;
    private String $marca;
    private String $modelo;
    private float $velocidadActual;
    private float $velocidadMaxima;
    private static int $totalVehiculosCreados = 0;

    public function __construct(String $id, String $marca, String $modelo, float $velocidadActual, float $velocidadMaxima) {
        $this->id = $id;
        $this->marca = $marca;
        $this->modelo = $modelo;
        $this->velocidadActual = $velocidadActual === null ? 0 : $velocidadActual;
        $this->velocidadMaxima = $velocidadMaxima;
        self::$totalVehiculosCreados++;
    }

    public function getId() {
        return $this->id;
    }

    public function getMarca() {
        return $this->marca;
    }

    public function getModelo() {
        return $this->modelo;
    }

    public function getVelocidadActual() {
        return $this->velocidadActual;
    }

    public function getVelocidadMaxima() {
        return $this->velocidadMaxima;
    }

    public function setId(String $id) {
        $this->id = $id;
    }

    public function setMarca(String $marca) {
        $this->marca = $marca;
    }

    public function setModelo(String $modelo) {
        $this->modelo = $modelo;
    }

    public function setVelocidadActual(float $velocidadActual) {
        $this->velocidadActual = $velocidadActual;
    }

    public function setVelocidadMaxima(float $velocidadMaxima) {
        $this->velocidadMaxima = $velocidadMaxima;
    }

    public static function totalCreados() {
        echo "Total de vehículos creados: " . self::$totalVehiculosCreados;
    }
}
?>