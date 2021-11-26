package com.rosa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.rosa.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        CategoriaDao dao = new CategoraDao();
        Categoria model = new Categoria();
        model.setNome("Novo teste");
        model.setDescricao("Descrição");

        //Criar uma fábrica de gestão de banco
    

   
        for (Categoria categoria : list) {
            System.out.printf("%d | %s - %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

    }
}
