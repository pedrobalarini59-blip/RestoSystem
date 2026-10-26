package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Empleados {

    public static void agregarEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleado (cargo, nombre, id, fechaIngreso, id_restaurante) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, empleado.getCargo());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getId());
            ps.setString(4, empleado.getfechaIngreso());
            ps.setString(5, empleado.getIdRestaurante());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public static Empleado buscarEmpleado(String id) {
        String sql = "SELECT * FROM Empleado WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String cargo = rs.getString("cargo");
                if (cargo.equalsIgnoreCase("Mozo")) {
                    return new Mozo(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        cargo,
                        rs.getString("fechaIngreso"),
                        rs.getString("id_restaurante")
                    );
                } else {
                    return new Cocinero(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        cargo,
                        rs.getString("fechaIngreso"),
                        rs.getString("id_restaurante")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }

    public static void eliminarEmpleado(String id) {
        String sql = "DELETE FROM Empleado WHERE id = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static List<Empleado> getListaEmpleados() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM Empleado";

        try (Connection con = Conexion.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String cargo = rs.getString("cargo");
                String fechaIngreso = rs.getString("fechaIngreso");
                String idRestaurante = rs.getString("id_restaurante");

                if (cargo.equalsIgnoreCase("Mozo")) {
                    lista.add(new Mozo(id, nombre, cargo, fechaIngreso, idRestaurante));
                } else {
                    lista.add(new Cocinero(id, nombre, cargo, fechaIngreso, idRestaurante));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}