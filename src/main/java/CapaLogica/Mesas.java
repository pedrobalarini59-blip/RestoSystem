package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class Restaurantes {

    public static String generarNuevoIdRestaurante() {
        return generarNuevoId("R");
    }

    private static String generarNuevoId(String prefijo) {
        int max = 0;
        for (Restaurante restaurante : getListaRestaurantes()) {
            if (restaurante == null || restaurante.getId() == null) {
                continue;
            }
            String id = restaurante.getId().trim();
            if (id.isEmpty()) {
                continue;
            }
            String numeros = id.replaceAll("[^0-9]", "");
            if (!numeros.isEmpty()) {
                try {
                    int numero = Integer.parseInt(numeros);
                    if (numero > max) {
                        max = numero;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return prefijo + String.format("%03d", max + 1);
    }

    public static void cargarComboRestaurantes(JComboBox<String> comboBox) {
        if (comboBox == null) {
            return;
        }

        comboBox.removeAllItems();
        List<Restaurante> restaurantes = getListaRestaurantes();

        if (restaurantes.isEmpty()) {
            comboBox.addItem("No hay restaurantes registrados");
            return;
        }

        for (Restaurante restaurante : restaurantes) {
            comboBox.addItem(restaurante.getNombre());
        }
    }

    public static String obtenerIdRestaurantePorNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "";
        }

        for (Restaurante restaurante : getListaRestaurantes()) {
            if (restaurante.getNombre().equalsIgnoreCase(nombre.trim())) {
                return restaurante.getId();
            }
        }
        return "";
    }

    public static String obtenerNombreRestaurantePorId(String id) {
        if (id == null || id.trim().isEmpty()) {
            return "";
        }

        for (Restaurante restaurante : getListaRestaurantes()) {
            if (restaurante.getId().equalsIgnoreCase(id.trim())) {
                return restaurante.getNombre();
            }
        }
        return "";
    }

    public static void agregarRestaurante(Restaurante restaurante) {
        String sql = "INSERT INTO Restaurante (id, Nombre, `dirección`, telefono) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, restaurante.getId());
            ps.setString(2, restaurante.getNombre());
            ps.setString(3, restaurante.getDireccion());
            ps.setString(4, restaurante.getTelefono());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Restaurante buscarRestaurante(String id) {
        String sql = "SELECT * FROM Restaurante WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Restaurante(
                    rs.getString("id"),
                    rs.getString("Nombre"),
                    rs.getString("dirección"),
                    rs.getString("telefono")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarRestaurante(String id) {
        String sql = "DELETE FROM Restaurante WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Restaurante> getListaRestaurantes() {
        List<Restaurante> lista = new ArrayList<>();
        String sql = "SELECT * FROM Restaurante";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Restaurante(
                    rs.getString("id"),
                    rs.getString("Nombre"),
                    rs.getString("dirección"),
                    rs.getString("telefono")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}
