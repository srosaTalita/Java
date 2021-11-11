package aulas.aula01.view;

import java.sql.*;

public class DBConnection4 {
    
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
       
            //Statement - query SQL
            Statement statement = conn.createStatement();
            String sql = "UPDATE produto SET nome = 'test' WHERE id = 4";
            statement.execute(sql);
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
                
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
            e.printStackTrace();
        }
    }
}
