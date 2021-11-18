package aulas.aula04.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;
import aulas.aula04.dao.CategoriaDao;
import aulas.aula04.model.Categoria;

public class Create {
    public static void main(String[] args) {   
        try(Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat = new Categoria("Categoria", "nova");
            dao.create(cat);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
