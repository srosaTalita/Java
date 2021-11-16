package pratica.ATP48;

import java.sql.*;

public class Read {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");   
            String sql = "SELECT * FROM categoria";
            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.execute();

            ResultSet result = prepStatement.getResultSet();
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
