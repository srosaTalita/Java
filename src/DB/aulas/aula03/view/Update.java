package aulas.aula03.view;

import java.sql.*;

import aulas.aula03.utils.ConnectionFactory;

public class Update {
    public static void main(String[] args) {
        
        // try with resources
        try(Connection conn = new ConnectionFactory().getConnection()){   
            String nome = "Higiene";
            int id = 8;
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
