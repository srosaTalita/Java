package moduloPOO.pratica.aula7.Aluno;

public class Aluno {
    
    private String nome;
    private int idade;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Sobrescrita
    @Override
    public String toString() {
        return this.nome + ", " + this.matricula + ", " + this.idade + " anos.";
    }
}