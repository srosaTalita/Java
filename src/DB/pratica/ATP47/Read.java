package pratica.ATP47;

import java.sql.*;

public class Read {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
    
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM categoria";
            statement.execute(sql);
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("%d: %s - %s\n", id, nome, descricao);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
