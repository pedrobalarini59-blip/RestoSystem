package CapaLogica;

public class Pedido {

    private String id_pedido;
    private String fecha;
    private String hora;
    private String total;
    private String estado;
    private String idRestaurante;

    public Pedido(String id_pedido, String fecha, String hora, String total, String estado, String idRestaurante) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.estado = estado;
        this.idRestaurante = idRestaurante;
    }

    public void elPedidoseabrio() {
        this.estado = EstadoPedido.ABIERTO.toString();
    }

    public void elPedidosecerro() {
        this.estado = EstadoPedido.CERRADO.toString();
    }

    public void elPedidoseanulo() {
        this.estado = EstadoPedido.ANULADO.toString();
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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