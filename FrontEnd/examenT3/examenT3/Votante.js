import {Videojuego} from "./Videojuego.js";

export class Votante {
    constructor(nombre) {
        this.nombre = nombre;
        this.votado = null;
    }

    get getNombre() { return this.nombre; }
    get getVotado() { return this.votado; }
    set setNombre(newNombre) { this.nombre = newNombre; }
    set setVotado(newVotado) { this.votado = newVotado; }

    votar(videojuego) {
        if (this.votado === null) {
            if (videojuego.anyadirVoto() > 0) {
                this.setVotado(videojuego);
                return videojuego.getVotos();
            } else { return -1}
        } else { return -1 }
    }
    
    listar() {
        console.log(`Nombre: ${this.nombre}`);
        console.log(`Votado: ${this.votado.getTitulo()}`);
    }

    modificar(nombre) {
        let nombreActual = this.getNombre();
        this.setNombre(nombre);
        if (nombre === nombreActual) { return false } else { return true };
    }
}