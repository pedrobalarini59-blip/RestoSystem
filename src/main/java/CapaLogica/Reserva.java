
package CapaLogica;

import java.time.LocalTime;


public class Reserva {
    
    private String id;
    private LocalTime fecha; 
    private  LocalTime hora;
    private int cantidadComensales;
    private EstadoReserva estado;
    
    public Reserva(String id, LocalTime fecha, LocalTime hora, int cantidadComensales, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidadComensales = cantidadComensales;
        this.estado = EstadoReserva.CONFIRMADA;
    }
    
    public void cancelarReserva() {
        this.estado = EstadoReserva.CANCELADA;
    }
    
    public void marcarReservacomocumplida() {
        this.estado = EstadoReserva.CUMPLIDA;
    }
    
       public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
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
          
          public int getcantidadComensales() {
        return cantidadComensales;
    }
          
          public void setCantidadComensales(int cantidadComensales) {
              this.cantidadComensales = cantidadComensales;
              
           
      }
       
}
