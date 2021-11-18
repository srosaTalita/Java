package aulas.aula04.dao;

import java.sql.*;
import java.util.ArrayList;
import aulas.aula04.model.Categoria;

public class CategoriaDao {

    private Connection conn;
    
    public CategoriaDao(Connection conn){
        this.conn = conn;
    }
    
    public void create(Categoria model) throws SQLException{      
        String sql = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
        
        PreparedStatement prepStatement = this.conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        prepStatement.setString(1, model.getNome());
        prepStatement.setString(2, model.getDescricao());
        prepStatement.execute();

        ResultSet info = prepStatement.getGeneratedKeys();
        while(info.next()){
            int id = info.getInt("id");
            System.out.println(id);
        }
    } 
    
    public ArrayList<Categoria> list() throws SQLException{
        ArrayList<Categoria> list = new ArrayList<Categoria>();
            
        try (PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria")) {
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"), result.getString("descricao"));
                list.add(cat);
            }   
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int update(Categoria model) throws SQLException{
        String sql = "UPDATE categoria SET nome = ? WHERE id = ?";
        int linhasAfetadas = 0;

        try (PreparedStatement prepStatement = conn.prepareStatement(sql);) {
            prepStatement.setString(1, model.getNome());
            prepStatement.setInt(2, model.getId());
            prepStatement.execute();

            linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);        
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }

    public int delete(int id){
        int linhasAfetadas = 0;
        String sql = "DELETE FROM categoria WHERE id = ?";

        try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
            prepStatement.setInt(1, id);
            prepStatement.execute();
            linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);       
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }
}
