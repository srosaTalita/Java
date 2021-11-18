package pratica.ATP51.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;
import pratica.ATP51.dao.CategoriaDao;

public class Delete {
    public static void main(String[] args) {
        // try with resources
        try(Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);
            dao.delete(11);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
