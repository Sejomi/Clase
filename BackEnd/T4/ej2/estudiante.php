<?php
    class Estudiante {
        public int $nia;
        public String $nombre;
        public int $edad;
        public String $ciclo;
        public float $notaFinal;

        public function __construct (int $nia, String $nombre, int $edad, String $ciclo, float $notaFinal) {
            $this->validarNia($nia) ? $this->nia = $nia : $this->error("El nia es inválido.");
            !is_null($nombre) ? $this->nombre = $nombre : $this->error("El nombre esta vacío.");
            $edad > 15 && $edad < 101 ? $this->edad = $edad : $this->error("La edad es inválida.");
            preg_match("/[G][MS]$/", $ciclo) ? $this->ciclo = $ciclo : $this->error("El ciclo es inválido");
            $notaFinal >= 0 && $notaFinal <= 10 ? $this->notaFinal = $notaFinal : $this->error("La nota final es inválida.");
        }

        public function error(String $mensaje) {
            throw new InvalidArgumentException($mensaje);
        }

        public function validarNia(int $nia) {
            return preg_match('/[0-9]{8}$/', $nia);
        }
    }
?>