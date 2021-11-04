package aulas.aula32.model;

public class Pessoa extends BaseModel{
    
    public String nome;
    public String sobrenome;

    public Pessoa(){ //sobrecarga de métodos
        super();
    }

    public Pessoa(String pessoaString){ //sobrecarga de métodos
        String[] dados = pessoaString.split(";");
        this.id = Integer.parseInt(dados[0]);
        this.nome = dados[1];
        this.sobrenome = dados[2];
    }

    @Override
    public String toString() {
        String info = String.format("%s;%s;%s;", this.id, this.nome, this.sobrenome);
        return info;
    }
}
