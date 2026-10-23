import {Producto} from './Producto.js';

export class Libro extends Producto {
    // Constructor
    constructor(titulo, autor) {
        super();
        this._titulo = titulo;
        this._autor = autor;
        this._isbn = "978-84-376-0494-7";
        this._editorial = "Cátedra";
        this._portada = "portada.jpg";
        this._genero = "Realismo mágico";
        this._formato = "Tapa blanda";
        this._idioma = "Español";
    }

    // Gets y sets
    get titulo() { return this._titulo; }
    set titulo(valor) { this._titulo = valor; }
    get autor() { return this._autor; }
    set autor(valor) { this._autor = valor; }
    get isbn() { return this._isbn; }
    set isbn(valor) { this._isbn = valor; }
    get editorial() { return this._editorial; }
    set editorial(valor) { this._editorial = valor; }
    get portada() { return this._portada; }
    set portada(valor) { this._portada = valor; }
    get genero() { return this._genero; }
    set genero(valor) { this._genero = valor; }
    get formato() { return this._formato; }
    set formato(valor) { this._formato = valor; }
    get idioma() { return this._idioma; }
    set idioma(valor) { this._idioma = valor; }

    // Listar
    listar() {
        super.listar();
        console.log(`Título: ${this.titulo}`);
        console.log(`Autor: ${this.autor}`);
        console.log(`ISBN: ${this.isbn}`);
        console.log(`Editorial: ${this.editorial}`);
        console.log(`Portada: ${this.portada}`);
        console.log(`Género: ${this.genero}`);
        console.log(`Formato: ${this.formato}`);
        console.log(`Idioma: ${this.idioma}`);
    }

    // Modificar precio (devuelve true si es válido)
    modificar(nuevoPrecio) {
        if (isNaN(nuevoPrecio) || nuevoPrecio <= 0) {
            return false;
        }
        this.precio = nuevoPrecio;
        return true;
    }

    // Vender (devuelve true si quedaban libros)
    vender() {
        if (this.cantidad <= 0) {
            return false;
        }
        this.cantidad--;
        return true;
    }
}
