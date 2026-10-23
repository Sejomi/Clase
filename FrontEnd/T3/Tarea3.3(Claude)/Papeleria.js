import {Producto} from './Producto.js';

export class Papeleria extends Producto {
    // Constructor
    constructor(nombre, tipo) {
        super();
        this._nombre = nombre;
        this._tipo = tipo;
    }

    // Gets y sets
    get nombre() { return this._nombre; }
    set nombre(valor) { this._nombre = valor; }
    get tipo() { return this._tipo; }
    set tipo(valor) { this._tipo = valor; }

    // Listar
    listar() {
        super.listar();
        console.log(`Nombre: ${this.nombre}`);
        console.log(`Tipo: ${this.tipo}`);
    }
}
