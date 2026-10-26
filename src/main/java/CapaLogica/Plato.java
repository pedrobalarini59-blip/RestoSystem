package CapaLogica;

public class Plato {

    private String id_plato;
    private String nombre;
    private String precio;
    private String descripcion;
    private String categoria;
    private String idRestaurante;

    public Plato(String id_plato, String nombre, String precio, String descripcion, String categoria, String idRestaurante) {
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.idRestaurante = idRestaurante;
    }

    public String getId_plato() {
        return id_plato;
    }

    public void setId_plato(String id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
}