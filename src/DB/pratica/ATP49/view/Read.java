package pratica.ATP49.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;

public class Read {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection()){  
            String sql = "SELECT * FROM categoria";
            
            try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.execute();
    
                ResultSet result = prepStatement.getResultSet();
                while(result.next()){
                    int id = result.getInt("id");
                    String nome = result.getString("nome");
                    String descricao = result.getString("descricao");
                    System.out.printf("%d: %s - %s\n", id, nome, descricao);
                }   
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
