class desarrolladora {
    constructor (id, nombre, pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
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

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getPais() {
        return this.pais;
    }

    setPais(pais) {
        this.pais = pais;
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