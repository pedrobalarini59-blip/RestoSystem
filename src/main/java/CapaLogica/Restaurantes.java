package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Restaurantes {

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
