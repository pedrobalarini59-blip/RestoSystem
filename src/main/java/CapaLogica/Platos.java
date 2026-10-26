package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Platos {

    public static void agregarPlato(Plato plato) {
        String sql = "INSERT INTO Plato (id, nombre, descripcion, precio, categoria, id_restaurante) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, plato.getId_plato());
            ps.setString(2, plato.getNombre());
            ps.setString(3, plato.getDescripcion());
            ps.setString(4, plato.getPrecio());
            ps.setString(5, plato.getCategoria());
            ps.setString(6, plato.getIdRestaurante());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Plato buscarPlato(String id) {
        String sql = "SELECT * FROM Plato WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Plato(
                    rs.getString("id"),
                    rs.getString("nombre"),
                    rs.getString("precio"),
                    rs.getString("descripcion"),
                    rs.getString("categoria"),
                    rs.getString("id_restaurante")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarPlato(String id) {
        String sql = "DELETE FROM Plato WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Plato> getListaPlatos() {
        List<Plato> lista = new ArrayList<>();
        String sql = "SELECT * FROM Plato";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Plato(
                    rs.getString("id"),
                    rs.getString("nombre"),
                    rs.getString("precio"),
                    rs.getString("descripcion"),
                    rs.getString("categoria"),
                    rs.getString("id_restaurante")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}