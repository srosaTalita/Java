package aulas.aula03.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;

public class Delete {
    public static void main(String[] args) {
        
        // try with resources
        try(Connection conn = new ConnectionFactory().getConnection()){

            int id = 2;         
            String sql = "DELETE FROM categoria WHERE id = ?";

            try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, id);
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
