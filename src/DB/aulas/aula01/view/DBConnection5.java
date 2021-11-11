package aulas.aula01.view;

import java.sql.*;

public class DBConnection5 {
    
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM pessoa WHERE id > 10";
            statement.execute(sql);   
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);         


            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
