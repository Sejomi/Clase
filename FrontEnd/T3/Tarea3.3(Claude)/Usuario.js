export class Usuario {
    // Constructor
    constructor(usuario, pass, nombre, apellidos, dni, email, telefono) {
        this._usuario = usuario;
        this._pass = pass;
        this._nombre = nombre;
        this._apellidos = apellidos;
        this._dni = dni;
        this._email = email;
        this._telefono = telefono;
    }

    // Gets y sets
    get usuario() { return this._usuario; }
    set usuario(valor) { this._usuario = valor; }
    get pass() { return this._pass; }
    set pass(valor) { this._pass = valor; }
    get nombre() { return this._nombre; }
    set nombre(valor) { this._nombre = valor; }
    get apellidos() { return this._apellidos; }
    set apellidos(valor) { this._apellidos = valor; }
    get dni() { return this._dni; }
    set dni(valor) { this._dni = valor; }
    get email() { return this._email; }
    set email(valor) { this._email = valor; }
    get telefono() { return this._telefono; }
    set telefono(valor) { this._telefono = valor; }

    // Cambiar contraseña (mínimo 4 caracteres)
    cambiarPass(pass) {
        if (pass.length < 4) {
            return false;
        }
        this.pass = pass;
        return true;
    }

    // Listar
    listar() {
        console.log(`Nombre: ${this.nombre}`);
        console.log(`Apellidos: ${this.apellidos}`);
        console.log(`Nickname: ${this.usuario}`);
        console.log(`Contraseña: ${this.pass}`);
        console.log(`DNI: ${this.dni}`);
        console.log(`Email: ${this.email}`);
        console.log(`Teléfono: ${this.telefono}`);
    }
}
