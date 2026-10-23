import {Usuario} from './Usuario.js';

export class Cliente extends Usuario {
    // Constructor
    constructor(usuario, pass, nombre, apellidos, dni, email, telefono, fechnac, domicilio) {
        super(usuario, pass, nombre, apellidos, dni, email, telefono);
        this._fechnac = fechnac;
        this._domicilio = domicilio;
        this._metodopago = null;
    }

    // Gets y sets
    get fechnac() { return this._fechnac; }
    set fechnac(valor) { this._fechnac = valor; }
    get domicilio() { return this._domicilio; }
    set domicilio(valor) { this._domicilio = valor; }
    get metodopago() { return this._metodopago; }
    set metodopago(valor) { this._metodopago = valor; }

    // Añadir método de pago
    anyadirMetodoPago(metodo) {
        if (metodo === null) {
            return false;
        }
        this.metodopago = metodo;
        return true;
    }

    // Listar
    listar() {
        super.listar();
        console.log(`Fecha de nacimiento: ${this.fechnac.toLocaleDateString()}`);
        console.log(`Domicilio: ${this.domicilio}`);
        if (this.metodopago !== null) {
            console.log(`Método de pago: ${this.metodopago.tipo} (${this.metodopago.identificador})`);
        } else {
            console.log("Método de pago: ninguno");
        }
    }
}
