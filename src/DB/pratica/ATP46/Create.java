package pratica.ATP46;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");

            Statement statement = conn.createStatement();
            String sql = "INSERT INTO produto(nome, descricao, preco, id_categoria) VALUES('shampoo', 'anticaspa', 8.0, 2)";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet info = statement.getGeneratedKeys();

            while(info.next()){
                int id = info.getInt("id");
                String nome = info.getString("nome");
                String descricao = info.getString("descricao");
                Float preco = info.getFloat("preco");
                System.out.printf("%d: %s - %s | R$ %.2f\n", id, nome, descricao, preco);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
