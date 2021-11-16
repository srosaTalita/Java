package pratica.ATP47;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");

            Statement statement = conn.createStatement();
            String sql = "INSERT INTO categoria(nome, descricao) VALUES('bebidas', 'alcoolicas')";
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet info = statement.getGeneratedKeys();

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
