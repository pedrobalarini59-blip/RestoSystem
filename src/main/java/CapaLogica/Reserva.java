package CapaLogica;

public class Reserva {

    private String id;
    private String fecha;
    private String hora;
    private String cantidadComensales;
    private String estado;
    private String idRestaurante;

    public Reserva(String id, String fecha, String hora, String cantidadComensales, String estado, String idRestaurante) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidadComensales = cantidadComensales;
        this.estado = estado;
        this.idRestaurante = idRestaurante;
    }

    public void cancelarReserva() {
        this.estado = EstadoReserva.CANCELADA.toString();
    }

    public void marcarReservacomocumplida() {
        this.estado = EstadoReserva.CUMPLIDA.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String gethora() {
        return hora;
    }

    public void sethora(String hora) {
        this.hora = hora;
    }

    public String getcantidadComensales() {
        return cantidadComensales;
    }

    public void setCantidadComensales(String cantidadComensales) {
        this.cantidadComensales = cantidadComensales;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
}