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

    // @Override
    // public boolean equals(Object obj) {
    //     if(obj instanceof Produtos){
    //         Produtos outra = (Produtos)obj;
    //         if(this.nome.equals(outra.nome) && this.valor.equals(outra.valor) && 
    //         this.categoria.marca.equals(outra.categoria.marca) && this.categoria.tipo.equals(categoria.tipo))
    //             return true;
    //     }
    //     return false;
    // }
}
