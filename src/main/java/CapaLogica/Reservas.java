package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {

    public static String generarNuevoIdPedido() {
        return generarNuevoId("P");
    }

    private static String generarNuevoId(String prefijo) {
        int max = 0;
        for (Pedido pedido : getListaPedidos()) {
            if (pedido == null || pedido.getId_pedido() == null) {
                continue;
            }
            String id = pedido.getId_pedido().trim();
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

    public static void agregarPedido(Pedido pedido) {
        String sql = "INSERT INTO Pedido (id, fecha, hora, importe_total, estado, id_restaurante) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, pedido.getId_pedido());
            ps.setString(2, pedido.getfecha());
            ps.setString(3, pedido.gethora());
            ps.setString(4, pedido.getTotal());
            ps.setString(5, pedido.getEstado());
            ps.setString(6, pedido.getIdRestaurante());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Pedido buscarPedido(String id) {
        String sql = "SELECT * FROM Pedido WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Pedido(
                    rs.getString("id"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("importe_total"),
                    rs.getString("estado"),
                    rs.getString("id_restaurante")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarPedido(String id) {
        String sql = "DELETE FROM Pedido WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Pedido> getListaPedidos() {
        List<Pedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM Pedido";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Pedido(
                    rs.getString("id"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("importe_total"),
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
