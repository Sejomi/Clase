export class Producto {
    static contador = 0;

    // Constructor
    constructor() {
        Producto.contador++;
        this._codigo = "P" + Producto.contador;
        this._precio = 35;
        this._cantidad = 1;
    }

    // Gets y sets
    get codigo() { return this._codigo; }
    set codigo(valor) { this._codigo = valor; }
    get precio() { return this._precio; }
    set precio(valor) { this._precio = valor; }
    get cantidad() { return this._cantidad; }
    set cantidad(valor) { this._cantidad = valor; }

    // Listar
    listar() {
        console.log(`Código: ${this.codigo}`);
        console.log(`Precio: ${this.precio}`);
        console.log(`Cantidad: ${this.cantidad}`);
    }
}
