package pratica.ATP31.model;

public class Produtos extends Base{
    
    public String nome;
    public String valor;
    public Categoria categoria;

    public Produtos(){
        categoria = new Categoria();
    }

    @Override
    public String toString() {
        return super.toString() + nome + ", " + valor + " reais." + "\n" + categoria.toString();
    }
}
