package CapaLogica;

import java.util.ArrayList;
import java.util.List;
public class Clientes {
    
    private static List<Cliente> listaClientes = new ArrayList<>();
   
    public static Cliente buscarCliente(String documento) {
        for (Cliente c : listaClientes) {
           if (c.getDocumento().equals(documento)) {
               return c;
           }
        }
        return null;
    }
   
     public static void agregarCliente(Cliente cliente) {
    listaClientes.add(cliente);
}
    
   public static void eliminarCliente(String documento) {
    for (Cliente c : listaClientes) {
        if (c.getDocumento().equals(documento)) {
            listaClientes.remove(c);
            return;
           }
         }
   
       }
   public static List<Cliente> getlistaClientes() {
      return listaClientes; 
   }
   }

 



















