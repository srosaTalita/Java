package main.java.com.rosa.dao;

public class CategoriaDao {

    private EntityManager entityManager;

    public CategoriaDao(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.entityManager = factory.createEntityManager();
    }
    
    public int create(Categoria model)
    {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
    }

    public List<Categoria> read()
    {
        return this.EntityManager
            .createQuery("SELECT c FROM Categoria c", Categoria.class)
            .getResultList();
    }

    public void update()
    {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit();
    }

    public void delete(int id)
    {
        Categoria model = this.entityManager.find(Categoria.class, id);
        if(model != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model);
            this.entityManager.getTransaction().commit();
        }
    }
}
