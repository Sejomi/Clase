import {Votante} from "./Votante.js";

export class Streamer extends Votante {
    constructor(nombre, plataforma, idioma) {
        super(nombre)
        this.plataforma = plataforma;
        this.idioma = idioma;
    }
    get getPlataforma() { return this.plataforma; }
    get getIdioma() { return this.idioma; }
    set setPlataforma(newPlataforma) { this.plataforma = newPlataforma; }
    set setIdioma(newPais) { this.pais = newPais; }

    listar() {
        super.listar();
        console.log(`Plataforma: ${this.plataforma}`);
        console.log(`Idioma: ${this.idioma}`);
    }

    modificar(nombre, plataforma, idioma) {
        let modificado = super.modificar(nombre);
        let plataformaActual = this.getPlataforma();
        let idiomaActual = this.getIdioma();
        this.setPlataforma(plataforma);
        this.setIdioma(idioma);
        if (modificado === false && plataformaActual === plataforma && idiomaActual === idioma) { return false } else { return true };
    }
}