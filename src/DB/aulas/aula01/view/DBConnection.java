package aulas.aula01.view;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String password = "123456789";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn = DriverManager.getConnection(connectionString, user, password);
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
            e.printStackTrace();
        }
    }
}
