package CapaLogica;

public abstract class Empleado {

    private String id;
    private String nombre;
    private String cargo;
    private String fechaIngreso;
    private String idRestaurante;

    public Empleado(String id, String nombre, String cargo, String fechaIngreso, String idRestaurante) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.idRestaurante = idRestaurante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public abstract String getRol();

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getfechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
}