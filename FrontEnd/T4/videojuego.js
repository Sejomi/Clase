class videojuego {
    constructor (id, titulo, precio, genero, devId, imagen) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
        this.devId = devId;
        this.imagen = imagen;
        this.activo = true;
        this.created_at = new Date();
        this.modified_at = new Date();
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getTitulo() {
        return this.titulo;
    }

    setTitulo(titulo) {
        this.titulo = titulo;
    }

    getPrecio() {
        return this.precio;
    }

    setPrecio(precio) {
        this.precio = precio;
    }

    getGenero() {
        return this.genero;
    }

    setGenero(genero) {
        this.genero = genero;
    }

    getDevId() {
        return this.devId;
    }

    setDevId(devId) {
        this.devId = devId;
    }

    getImagen() {
        return this.imagen;
    }

    setImagen(imagen) {
        this.imagen = imagen;
    }

    getActivo() {
        return this.activo;
    }

    setActivo(activo) {
        this.activo = activo;
    }

    getCreatedAt() {
        return this.created_at;
    }

    setCreatedAt(created_at) {
        this.created_at = created_at;
    }

    getModifiedAt() {
        return this.modified_at;
    }

    setModifiedAt(modified_at) {
        this.modified_at = modified_at;
    }
}