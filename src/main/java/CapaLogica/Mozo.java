package CapaLogica;

import java.util.List;

public class Mozo extends Empleado {

    private List<Pedido> pedidosAtendidos;

    public Mozo(String id, String nombre, String cargo, String fechaIngreso, String idRestaurante) {
        super(id, nombre, cargo, fechaIngreso, idRestaurante);
    }

    @Override
    public String getRol() {
        return "Mozo";
    }

    public void asignarPedido(Pedido pedido) {
        this.pedidosAtendidos.add(pedido);
    }
}