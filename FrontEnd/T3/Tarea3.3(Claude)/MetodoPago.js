export class MetodoPago {
    // Constructor
    constructor(tipo, identificador) {
        this._tipo = tipo;
        this._identificador = identificador;
    }

    // Gets y sets
    get tipo() { return this._tipo; }
    set tipo(valor) { this._tipo = valor; }
    get identificador() { return this._identificador; }
    set identificador(valor) { this._identificador = valor; }
}
