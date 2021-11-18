package view;

import java.sql.Connection;
import java.sql.SQLException;
import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

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
