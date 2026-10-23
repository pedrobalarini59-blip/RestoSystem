
package CapaLogica;

public class Cocinero extends Empleado {
    
       public Cocinero(int id, String nombre, String cargo, int fechaIngreso) {
       super(id, nombre, cargo, fechaIngreso);
    }
    
@Override 
    public String getRol() { 
        return "Cocinero";
    }
    
}












