import {Votante} from "./Votante.js";

export class Critico extends Votante {
    constructor(nombre, medio, pais) {
        super(nombre)
        this.medio = medio;
        this.pais = pais;
    }
    get getMedio() { return this.medio; }
    get getPais() { return this.pais; }
    set setMedio(newMedio) { this.medio = newMedio; }
    set setPais(newPais) { this.pais = newPais; }

    listar() {
        super.listar();
        console.log(`Medio: ${this.medio}`);
        console.log(`Pais: ${this.pais}`);
    }

    modificar(nombre, medio, pais) {
        let modificado = super.modificar(nombre);
        let medioActual = this.getMedio();
        let paisActual = this.getPais();
        this.setMedio(medio);
        this.setPais(pais);
        if (modificado === false && medioActual === medio && paisActual === pais) { return false } else { return true };
    }
}