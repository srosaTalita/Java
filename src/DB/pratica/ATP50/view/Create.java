package pratica.ATP50.view;

import java.sql.*;

import aulas.aula03.utils.ConnectionFactory;

public class Create {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection()){

            String nome = "Doceria";
            String descricao = "chocolates";
            String sql = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
            
            try (PreparedStatement prepStatement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
                prepStatement.setString(1, nome);
                prepStatement.setString(2, descricao);
                prepStatement.execute();
    
                ResultSet info = prepStatement.getGeneratedKeys();
                while(info.next()){
                    int id = info.getInt("id");
                    System.out.println(id);
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
