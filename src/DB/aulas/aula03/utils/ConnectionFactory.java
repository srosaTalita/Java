package aulas.aula03.utils;

import java.sql.*;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

//Classe para criar instâcias de objeto
public class ConnectionFactory {
    
    private DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456789");
        pool.setMaxPoolSize(10);
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }
}
