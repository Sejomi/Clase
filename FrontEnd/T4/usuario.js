class usuario {
    constructor (email, pass, devId) {
        this.email = email;
        this.pass = pass;
        this.devId = devId;
    }

    getEmail() {
        return this.email;
    }

    setEmail(email) {
        this.email = email;
    }

    getPass() {
        return this.pass;
    }

    setPass(pass) {
        this.pass = pass;
    }

    getDevId() {
        return this.devId;
    }

    setDevId(devId) {
        this.devId = devId;
    }
}