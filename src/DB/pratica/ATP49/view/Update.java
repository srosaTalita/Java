package pratica.ATP49.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;

public class Update {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection()){
            String nome = "Frios";
            int id = 1;
            String sql = "UPDATE categoria SET nome = ? WHERE id = ?";

            try (PreparedStatement prepStatement = conn.prepareStatement(sql);) {
                prepStatement.setString(1, nome);
                prepStatement.setInt(2, id);
                prepStatement.execute();
    
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);     
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
