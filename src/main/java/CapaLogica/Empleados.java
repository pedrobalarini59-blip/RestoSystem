package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Mesas {

    public static String generarNuevoIdMesa() {
        return generarNuevoId("M");
    }

    private static String generarNuevoId(String prefijo) {
        int max = 0;
        for (Mesa mesa : getListaMesas()) {
            if (mesa == null || mesa.getId() == null) {
                continue;
            }
            String id = mesa.getId().trim();
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

    public static void agregarMesa(Mesa mesa) {
        String sql = "INSERT INTO Mesa (id_mesa, numero, capacidad, ubicacion, id_restaurante) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, mesa.getId());
            ps.setString(2, mesa.getNumero());
            ps.setString(3, mesa.getCapacidad());
            ps.setString(4, mesa.getUbicacion());
            ps.setString(5, mesa.getIdRestaurante());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Mesa buscarMesa(String id) {
        String sql = "SELECT * FROM Mesa WHERE id_mesa = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Mesa(
                    rs.getString("id_mesa"),
                    rs.getString("numero"),
                    rs.getString("capacidad"),
                    rs.getString("ubicacion"),
                    rs.getString("id_restaurante")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarMesa(String id) {
        String sql = "DELETE FROM Mesa WHERE id_mesa = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Mesa> getListaMesas() {
        List<Mesa> lista = new ArrayList<>();
        String sql = "SELECT * FROM Mesa";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Mesa(
                    rs.getString("id_mesa"),
                    rs.getString("numero"),
                    rs.getString("capacidad"),
                    rs.getString("ubicacion"),
                    rs.getString("id_restaurante")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}
