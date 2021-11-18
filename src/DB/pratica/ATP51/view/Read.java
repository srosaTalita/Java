package pratica.ATP51.view;

import java.sql.*;
import aulas.aula03.utils.ConnectionFactory;
import pratica.ATP51.dao.CategoriaDao;
import pratica.ATP51.model.Categoria;

public class Read {
    public static void main(String[] args) {  
        try(Connection conn = new ConnectionFactory().getConnection()){  
            CategoriaDao dao = new CategoriaDao(conn);
            for (Categoria c : dao.list()) {
                System.out.println(c);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
