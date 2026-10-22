/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 61566716
 */
public class Conexion {    
    
    private static final String URL = "jdbc:mysql://localhost:3306/RestoSystem";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = ""; 

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
            return null;
        }
    }    
 
}
