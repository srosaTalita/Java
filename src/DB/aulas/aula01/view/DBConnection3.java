package aulas.aula01.view;

import java.sql.*;

public class DBConnection3 {
    
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
       
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO pessoa(nome, sobrenome, idade, endereco_id)values('Teste', 'Java', 2, 1)";

            statement.execute(sql, statement.RETURN_GENERATED_KEYS);            
            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                // comeca em 1(nao em 0)
                int id = ids.getInt(1);
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}