package CapaLogica;

import java.util.List;
import javax.swing.JComboBox;

public class SelectorRestaurante {

    // Llena el combo con los NOMBRES de los restaurantes que hay en la base
    public static void cargarCombo(JComboBox<String> combo) {
        List<Restaurante> lista = Restaurantes.getListaRestaurantes();
        combo.removeAllItems();
        for (Restaurante r : lista) {
            combo.addItem(r.getNombre());
        }
        combo.putClientProperty("listaRestaurantes", lista);
    }

    // Devuelve el ID del restaurante elegido en el combo ("" si no hay ninguno)
    @SuppressWarnings("unchecked")
    public static String obtenerIdSeleccionado(JComboBox<String> combo) {
        List<Restaurante> lista = (List<Restaurante>) combo.getClientProperty("listaRestaurantes");
        int indice = combo.getSelectedIndex();
        if (lista == null || indice < 0 || indice >= lista.size()) {
            return "";
        }
        return lista.get(indice).getId();
           
    }

    // Devuelve el NOMBRE del restaurante a partir de su ID
    public static String obtenerNombrePorId(String id) {
        Restaurante r = Restaurantes.buscarRestaurante(id);
        if (r == null) {
            return "Sin restaurante";
        }
        return r.getNombre();
    }
}
    
    
