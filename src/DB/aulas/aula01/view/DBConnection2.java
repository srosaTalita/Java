package aulas.aula01.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection2 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");
            
            //Statement - query SQL
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM produto");
            //Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            //Imprimir Resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d - %s\n", id, nome);
            }
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
            e.printStackTrace();
        }
    }
}
