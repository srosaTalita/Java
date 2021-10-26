package pratica.ATP31.model;

public class Categoria{
    
    public String tipo;
    public String marca;

    @Override
    public String toString() {
        return tipo + ", " + marca + ".";
    }
}
