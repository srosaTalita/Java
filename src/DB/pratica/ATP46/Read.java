package pratica.ATP46;

import java.sql.*;

public class Read {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
    
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM produto";
            statement.execute(sql);
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                Float preco = result.getFloat("preco");
                System.out.printf("%d: %s - %s | R$ %.2f\n", id, nome, descricao, preco);
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar :(");
            e.printStackTrace();
        }
    }
}
