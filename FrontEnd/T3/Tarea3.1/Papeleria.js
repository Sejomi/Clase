import * as Producto from './Producto.js';

class Papelería extends Producto{
    constructor(nombre, tipo, codigo, precio, cantidad) {
        super(codigo, precio, cantidad);
        this.nombre = nombre;
        this.tipo = tipo;
    }
    listar() {
    }
}