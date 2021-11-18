package pratica.ATP51.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;
import pratica.ATP51.dao.CategoriaDao;
import pratica.ATP51.model.Categoria;

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
