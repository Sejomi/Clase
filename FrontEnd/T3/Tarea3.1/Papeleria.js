import {Producto} from './Producto.js';

export class Papeleria extends Producto {
    // Constructor de la clase Papeleria
    constructor(nombre, tipo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
    }
    // Método para listar los atributos de la papelería
    listar(papelería) {
        super.listar(papelería);
        console.log(`Nombre: ${papelería.nombre}`);
        console.log(`Tipo: ${papelería.tipo}`);
    }
}