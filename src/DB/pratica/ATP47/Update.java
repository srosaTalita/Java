package pratica.ATP47;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
            Statement statement = conn.createStatement();
            String sql = "UPDATE categoria SET nome = 'Produtos' WHERE id in (1, 2)";
            statement.execute(sql);

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
