package moduloPOO.aula4;

public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
