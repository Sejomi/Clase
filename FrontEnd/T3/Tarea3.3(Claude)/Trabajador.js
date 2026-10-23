import {Usuario} from './Usuario.js';

export class Trabajador extends Usuario {
    // Constructor
    constructor(usuario, pass, nombre, apellidos, dni, email, telefono, admin, id) {
        super(usuario, pass, nombre, apellidos, dni, email, telefono);
        this._admin = admin;
        this._id = id;
    }

    // Gets y sets
    get admin() { return this._admin; }
    set admin(valor) { this._admin = valor; }
    get id() { return this._id; }
    set id(valor) { this._id = valor; }

    // Listar
    listar() {
        super.listar();
        console.log(`Administrador: ${this.admin}`);
        console.log(`ID: ${this.id}`);
    }
}
