package Produto.model;

public class Produto extends BaseModel{
    
    private String nome;
    private Double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + ", " + this.valor + " reais.";
    }
}
