
package CapaLogica;

import java.time.LocalTime;

public class Pedido {
    
      private String id_pedido;
    private LocalTime fecha; 
    private  LocalTime hora;
    private String total;
    private EstadoPedido estado;
    
     public Pedido(String id_pedido, LocalTime fecha, LocalTime hora, String total, String estado) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.estado = EstadoPedido.ABIERTO;
        
    }
    
      public void elPedidoseabrio() {
        this.estado = EstadoPedido.ABIERTO;
    }
    
    public void elPedidosecerro() {
        this.estado = EstadoPedido.CERRADO;
    }
    
    public void elPedidoseanulo() {
        this.estado = EstadoPedido.ANULADO;
    }
    
          public String getId_pedido() {
        return id_pedido;
    }
    
    public void setId_pedido(String id) {
        this.id_pedido = id_pedido;
    }
    
    public LocalTime getfecha() {
        return fecha;
    }
    
          public void setfecha(LocalTime fecha) {
              this.fecha = fecha;
          }
    
          public LocalTime gethora() {
              return hora;
          }
          
         
          public void sethora(LocalTime hora) {
              this.hora = hora;
          }
          
    
    public String getTotal() {
        return total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
}



















