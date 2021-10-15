package pratica.Livros.model;

public class Livros extends BaseModel{
    
    private String nome;
    private int ano;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.getId() + "- " + this.getNome() + ", " + this.getGenero() + ", " + this.getAno() + ".";
    }
}
