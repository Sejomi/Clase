let inputN = prompt("Introduzca su nombre:")
let input = prompt("Introduzca su edad:")
let estatus;
//Hacemos un condicional para comporbar cada uno de los rangos de edad.
    if (input > 12 && input < 18) {
        estatus = "Adolescente";
    }
    else if (input > 17 && input < 65) {
        estatus = "Trabajador/a";
    }
    else if (input > 64) {
        estatus = "Jubilado/a";
    } else {
        estatus = "Niño/a"
    }

//Imprimimos resultados.
console.log(`${inputN} tiene ${input} años y por lo tanto es ${estatus}`)