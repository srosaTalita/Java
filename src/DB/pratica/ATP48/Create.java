package pratica.ATP48;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
            String nome = "Doceria";
            String descricao = "chocolates";
            String sql = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
            
            PreparedStatement prepStatement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();

            ResultSet info = prepStatement.getGeneratedKeys();
            while(info.next()){
                int id = info.getInt("id");
                System.out.println(id);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
}
