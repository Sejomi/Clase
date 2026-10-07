import {Producto} from './Producto.js';

export class Libro extends Producto {
    // Constructor de la clase Libro
    constructor (titulo, autor) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "978-84-376-0494-7";
        this.editorial = "Cátedra";
        this.portada = "portada.jpg";
        this.genero = "Realismo mágico";
        this.formato = "Tapa blanda";
        this.idioma = "Español";
    }
    // Método para listar los atributos del libro
    listar(libro) {
        super.listar(libro);
        console.log(`Título: ${libro.titulo}`);
        console.log(`Autor: ${libro.autor}`);
        console.log(`ISBN: ${libro.isbn}`);
        console.log(`Editorial: ${libro.editorial}`);
        console.log(`Portada: ${libro.portada}`);
        console.log(`Género: ${libro.genero}`);
        console.log(`Formato: ${libro.formato}`);
        console.log(`Idioma: ${libro.idioma}`);
    }
}