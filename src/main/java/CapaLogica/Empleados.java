/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 61566716
 */
public class Empleados {
        public static void agregarEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleado (cargo, nombre, id, fechaIngreso) VALUES (?, ?, ?, ?)";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, empleado.getCargo());
            ps.setString(2, empleado.getNombre());
            ps.setInt(3, empleado.getId());
            ps.setInt(4, empleado.getfechaIngreso());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }
    public static Empleado buscarEmpleado(int id) {
        String sql = "SELECT * FROM Empleado WHERE id = ?";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new Empleado(
                    rs.getString("cargo"),
                    rs.getString("nombre"),
                    rs.getInt("id"),
                    rs.getInt("fechaIngreso")
                ) {
                    @Override
                    public String getRol() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }
    
    public static void eliminarEmpleado(int id) {
        String sql = "DELETE FROM Empleado WHERE id = ?";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
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
                lista.add(new Empleado(
                    rs.getString("cargo"),
                    rs.getString("nombre"),
                    rs.getInt("id"),
                    rs.getInt("fechaIngreso")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}
