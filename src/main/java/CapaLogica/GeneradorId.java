package CapaLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorId {

    // Devuelve un ID aleatorio de 6 cifras que todavía no existe en la tabla
    public static String generar(String tabla, String columna) {
        String sql = "SELECT COUNT(*) FROM " + tabla + " WHERE " + columna + " = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            while (true) {
                int candidato = ThreadLocalRandom.current().nextInt(100000, 1000000);
                ps.setInt(1, candidato);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next() && rs.getInt(1) == 0) {
                        return String.valueOf(candidato);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al generar ID: " + e.getMessage());
        }
        return "";
    }
}