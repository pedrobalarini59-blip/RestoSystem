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

    public static String conexion;
    public static boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        }catch(ClassNotFoundException e){
            return false;
        }
    };    
    
    public static Connection estableceConexion(){
        String usuario="root";
        String contra="";
        String url="jdbc:mysql://127.0.0.1:3306/RestoSystem";
        Connection conectar = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url,usuario,contra);
            System.out.println("Conección conectada");
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return conectar;
    }
    public static void Insertar(String dato){
        try{
            String[] valores = dato.split(":");
            String mysql = "insert into genero (IdGen, NomGen) values(?, ?);";
            Connection conectar = estableceConexion();
            PreparedStatement ps = conectar.prepareStatement(mysql);
            ps.setString(1, valores[0]);
            ps.setString(2, valores[1]);
            ps.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error" + e);
        }
    }
    
    
 
}
