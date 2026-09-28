<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 11</title>
    <style>
        body {
            font-family: sans-serif;
            text-align: justify;
            margin: 10px;
            padding: 5px;
        }
        table {
            border-collapse: collapse;
            width: 100%;
            max-width: 800px;    
        }
        th { 
            background-color: rgb(12, 27, 90);
            border-bottom: 1px solid #ddd;
            color: #bbcfeb;
            padding: 8px;
            text-align: center;
        }
        td {
            border-bottom: 1px solid #ddd;
            text-align: center;
            padding: 8px;
        }
    </style>
</head>
<body>
    <?php
    $ordenPeticiones = ["urgente", "normal", "urgente", "urgente", "normal"];
    $llamadaGlobal = 0;
        function ticketGlobal() {
            global $llamadaGlobal;
            $llamadaGlobal++;
            echo $llamadaGlobal;
        }
        function ticketStatic() {
            static $llamadaStatic;
            $llamadaStatic++;
            echo $llamadaStatic;
        }
        function ticketRoto() {
            $llamadaRoto = 0;
            $llamadaRoto++;
            echo $llamadaRoto;
        }
        function ticketPorCategoria(string $categoria) {
            static $urgente = 0;
            static $normal = 0;
            if (strtolower($categoria) == "urgente") {
                $urgente++;
                if ($urgente < 10) {
                    echo strtoupper($categoria) . "-00" . $urgente;
                } else if ($urgente < 100) {
                    echo strtoupper($categoria) . "-0" . $urgente;
                } else {
                    echo strtoupper($categoria) . "-" . $urgente;
                }
            } else {
                $normal++;
                if ($normal < 10) {
                    echo strtoupper($categoria) . "-00" . $normal;
                } else if ($normal < 100) {
                    echo strtoupper($categoria) . "-0" . $normal;
                } else {
                    echo strtoupper($categoria) . "-" . $normal;
                }
            }
        }
    ?>
    <table>
        <tr>
            <th>Llamada</th>
            <th>ticketGlobal()</th>
            <th>ticketStatic()</th>
            <th>ticketRoto()</th>
        </tr>
        <?php
        for ($i = 1; $i <= 4; $i++) {
        ?>
        <tr>
            <td><?php echo $i; ?></td>
            <td><?php ticketGlobal();?></td>
            <td><?php ticketStatic();?></td>
            <td><?php ticketRoto();?></td>
        </tr>
        <?php } ?>
    </table>
    <br><br>
    <table>
        <tr>
            <th>Llamada</th>
            <th>Categoría</th>
            <th>Resultado</th>
        </tr>
        <?php
        for ($i = 1; $i <= count($ordenPeticiones); $i++) {
        ?>
        <tr>
            <td><?php echo $i; ?></td>
            <td><?php echo strtoupper($ordenPeticiones[$i - 1]); ?></td>
            <td><?php ticketPorCategoria($ordenPeticiones[$i - 1]); ?></td>
        </tr>
        <?php } ?>
    </table>
</body>
</html>
