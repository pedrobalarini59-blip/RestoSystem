package CapaLogica;

public abstract class Empleado {
    
    private String id;
    private String nombre;
   private String cargo;
    private int fechaIngreso;
    
    public Empleado(String id, String nombre, String cargo, int fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
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
          
          public int getfechaIngreso() {
        return fechaIngreso;
    }
          
          public void setFechaIngreso(int fechaIngreso) {
              this.fechaIngreso = fechaIngreso;
          }
          
}

