package pratica.ATP48;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
            String nome = "Frios";
            int id = 1;
            String sql = "UPDATE categoria SET nome = ? WHERE id = ?";

            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);
            prepStatement.execute();

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
