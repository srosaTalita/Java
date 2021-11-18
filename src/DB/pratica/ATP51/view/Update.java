package pratica.ATP51.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;
import pratica.ATP51.dao.CategoriaDao;
import pratica.ATP51.model.Categoria;

public class Update {
    public static void main(String[] args) {
        // try with resources
        try(Connection conn = new ConnectionFactory().getConnection()){   
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria model = new Categoria(10, "Doces");
            dao.update(model);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
