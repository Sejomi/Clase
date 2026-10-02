import * as Producto from './Producto.js';

class Libro extends Producto{
    constructor(codigo, precio, cantidad, titulo, autor, isbn, editorial, portada, genero, formato, idioma) {
        super(codigo, precio, cantidad);
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.portada = portada;
        this.genero = genero;
        this.formato = formato;
        this.idioma = idioma;
    }
    listar() {
    }
}