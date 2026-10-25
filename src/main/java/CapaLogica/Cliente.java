package CapaLogica;
import java.util.List;
public class Cliente {
 
    private String documento;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private String idRestaurante;
    
    private List<Reserva> reserva;
    private List<Pedido> historialPedidos;
    
    public Cliente(String documento, String nombre, String apellido, String correoElectronico, String telefono, String idRestaurante) {
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correoElectronico = correoElectronico;
    this.telefono = telefono;
    this.idRestaurante = idRestaurante;
}
        
         public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String Documento) {
        this.documento = documento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
          public void setNombre(String nombre) {
              this.nombre = nombre;
          }
          
    public String getApellido() {
        return apellido;
    }
    
          public void setApellido(String apellido) {
              this.apellido = apellido;
          }
          
           public String getcorreoElectronico() {
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String CorreoElectronico) {
        this.correoElectronico = correoElectronico;
    }
         
   public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
    }




















