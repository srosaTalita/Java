package main.java.com.rosa.dao;

public class CategoriaDao {

    private EntityManager entityManager;

    public List<Categoria> read(){
        return this.getEntityManager()
            .createQuery("SELECT c FROM Categoria c", Categoria.class)
            .getResultList();
    }
    
    public void delete(int id){
        Object model = this.getEntityManager().find(Categoria.class, id);
        if(model != null){
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().remove(model);        
            this.getEntityManager().getTransaction().commit();
        }        
    }
}
