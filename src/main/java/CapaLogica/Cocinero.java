
package CapaLogica;

public class Cocinero extends Empleado {

    public Cocinero(String id, String nombre, String cargo, String fechaIngreso, String idRestaurante) {
        super(id, nombre, cargo, fechaIngreso, idRestaurante);
    }

    @Override
    public String getRol() {
        return "Cocinero";
    }
}












