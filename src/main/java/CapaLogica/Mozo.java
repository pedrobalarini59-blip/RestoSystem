package CapaLogica;

import java.util.List;

public class Mozo extends Empleado {
    private List<Pedido> pedidosAtendidos;
    
    public Mozo(String id, String nombre, String cargo, int fechaIngreso) {
       super(id, nombre, cargo, fechaIngreso);
    }
    
@Override 
    public String getRol() { 
        return "Mozo";
    }
    
    public void asignarPedido(Pedido pedido) {
        this.pedidosAtendidos.add(pedido);
    }
    
      }


   

