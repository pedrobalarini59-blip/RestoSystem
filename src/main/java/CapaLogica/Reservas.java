package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Reservas {

    public static void agregarReserva(Reserva reserva) {
        String sql = "INSERT INTO Reserva (id, fecha, hora, num_comensales, estado, id_restaurante) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, reserva.getId());
            ps.setString(2, reserva.getfecha());
            ps.setString(3, reserva.gethora());
            ps.setString(4, reserva.getcantidadComensales());
            ps.setString(5, reserva.getEstado());
            ps.setString(6, reserva.getIdRestaurante());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Reserva buscarReserva(String id) {
        String sql = "SELECT * FROM Reserva WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Reserva(
                    rs.getString("id"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("num_comensales"),
                    rs.getString("estado"),
                    rs.getString("id_restaurante")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarReserva(String id) {
        String sql = "DELETE FROM Reserva WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Reserva> getListaReservas() {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reserva";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Reserva(
                    rs.getString("id"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("num_comensales"),
                    rs.getString("estado"),
                    rs.getString("id_restaurante")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}