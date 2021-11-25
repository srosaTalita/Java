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
        System.out.println("Sistema de banco!");
        Categoria model = new Categoria();
        model.setNome("Novo teste");
        model.setDescricao("Descrição");

        //Criar uma fábrica de gestão de banco
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        
        //Criar conexão do banco
        EntityManager em = factory.createEntityManager();
        //FROM (nome da classe) - Não da tabela
        //getResultList: cria uma lista dos dados vindo da tabela
        //List: parecido com ArrayList mas com mais propriedades

        em.getTransaction().begin();
        em.persist(model);
        
        List<Categoria> list = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

        for (Categoria categoria : list) {
            System.out.printf("%d | %s - %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

        em.getTransaction().commit();
    }
}
