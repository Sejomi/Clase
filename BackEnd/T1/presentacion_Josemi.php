<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Presentación</title>
    <style>
        body {
            font-family: Arial, sans-serif;
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
            background-color: rgb(29, 86, 119); 
            color: white;
            border: 1px solid #ddd;
            padding: 8px;
        }
        td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1 style="color: rgb(29, 86, 119); font-family: Arial, sans-serif;">Hola, soy Jose Miguel Verdú Sagredo</h1>
    <p>Módulo: Desarrollo Web en Entorno Servidor - 2º DAW</p>
    <p>Fecha: <?php echo date("d/m/Y"); ?> - Hora: <?php echo date("H:i:s"); ?></p>
    <h2 style="font-style: bold;">Entorno de Ejecución</h2>
    <table>
        <tr>
            <th>Parámetro</th>
            <th>Valor</th>
        </tr>
        <tr>
            <td>Versión PHP</td>
            <td><?php echo phpversion(); ?></td>
        </tr>
        <tr>
            <td>Sistema Operativo</td>
            <td><?php echo php_uname(); ?></td>
        </tr>
        <tr>
            <td>Servidor Web</td>
            <td><?php echo $_SERVER['SERVER_NAME']; ?></td>
        </tr>
        <tr>
            <td>Memoria Limite</td>
            <td><?php echo ini_get('memory_limit'); ?></td>
        </tr>
        <tr>
            <td>Tamaño maximo de subida</td>
            <td><?php echo ini_get('upload_max_filesize'); ?></td>
        </tr>
        <tr>
            <td>Extensiones clave cargadas</td>
            <td><?php echo implode(', ', get_loaded_extensions()); ?></td>
        </tr>
    </table>
</body>
</html>