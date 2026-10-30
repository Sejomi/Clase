<?php
    require __DIR__ . '/estudiante.php';

    try {
        $alberto = new Estudiante(87654321, 'Manel', 17, 'Bachillerato', 8);
    } catch (Exception $e) {
        echo $e->getMessage();
    }
?>
