package aulas.aula02;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
        
        try {
            //SQL Injection -- Injetando uma SQL em um campo texto 
            // String nome = "Bebidas');delete from categoria; INSERT INTO categoria(nome, descricao)values('vix, deu ruim";
            String nome = "Higiene";
            String descricao = "Cães e Gatos";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456789");

            //Envia uma String ao banco, ao invés de concatenar o texto enviado como variável
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria(nome, descricao) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();

            ResultSet info = prepStatement.getGeneratedKeys();

            while(info.next()){
                int id = info.getInt("id");
                System.out.println(id);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
}