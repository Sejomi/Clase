<?php
$cont = 0;
class Libro {
    public String $titulo;
    public String $autor;

    public function __construct (String $titulo, String $autor) {
        $this->titulo = $titulo;
        $this->autor = $autor;
        global $cont;
        $cont++;
    }
}
?>