
package CapaLogica;


public class Mesa {
    
    private String id;
    private int numero;
    private int capacidad;
    private String ubicacion;
    
    public Mesa(String id, int numero, int capacidad, String ubicacion) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
      }  
        
          public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public int getNumero() {
        return numero;
    }
    
          public void setNumero(int numero) {
              this.numero = numero;
          }
    
          public int getCapacidad() {
              return capacidad;
          }
          
      
          public void setCapacidad(int capacidad) {
              this.capacidad = capacidad;
          }
          
      public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
          
  }

