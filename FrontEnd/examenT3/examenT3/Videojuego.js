export class Videojuego {
    constructor(titulo, estudio, genero) {
        if (titulo.trim().toLowerCase() == "league of legends") {
            console.log(titulo.trim().toLowerCase())
            throw new Error("League of Legends es tu ruina, ni lo intentes.");
        } else { this.titulo = titulo; }
        this.estudio = estudio;
        this.genero = genero;
        this.votos = 0
    }

    get getTitulo() { return this.titulo; }
    get getEstudio() { return this.estudio; }
    get getGenero() { return this.genero; }
    get getVotos() { return this.votos; }
    set setEstudio(newEstudio) { this.estudio = newEstudio; }
    set setGenero(newGenero) { this.genero = newGenero; }
    set setVotos(newVotos) { this.votos = newVotos; }
    set setTitulo(newTitulo) {
        if (newTitulo.trim().toLowerCase() == "leagueoflegends") {
            throw new Error("League of Legends es tu ruina, ni lo intentes.");
        } else { this.titulo = newTitulo; }
    }

    listar() {
        console.log(`Titulo: ${this.titulo}`);
        console.log(`Estudio: ${this.estudio}`);
        console.log(`Género: ${this.genero}`);
        console.log(`Votos: ${this.votos}`);
    }

    modificar(titulo, estudio, genero) {
        this.setTitulo(titulo);
        this.setEstudio(estudio);
        this.setGenero(genero);
        return true;
    }

    anyadirVoto() {
        this.votos++;
        return this.votos;
    }
}