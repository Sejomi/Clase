export class Producto {
    static contador = 0;
    // Constructor de la clase Producto
    constructor() {
        Producto.contador++;
        this.codigo = Producto.contador;
        this.precio = 35;
        this.cantidad = 1;
    }

    // Método para listar los atributos del producto
    listar(producto) {
        console.log(`Código: ${producto.codigo}`);
        console.log(`Precio: ${producto.precio}`);
        console.log(`Cantidad: ${producto.cantidad}`);
    }
}