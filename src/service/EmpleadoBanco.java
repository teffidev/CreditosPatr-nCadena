package service;

public abstract class EmpleadoBanco {

    protected EmpleadoBanco sigEmpleadoBanco;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco emp) {
        this.sigEmpleadoBanco = emp;
        return this;
    }

    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

}
