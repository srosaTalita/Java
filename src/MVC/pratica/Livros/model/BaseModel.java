package pratica.Livros.model;

public abstract class BaseModel {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int createId(){
        id++;
        return id;
    }
}
