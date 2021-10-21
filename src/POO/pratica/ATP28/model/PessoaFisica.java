package model;

public class PessoaFisica extends Base{
    
    public String nome;
    public String sobrenome;
    public String cpf;
    public Endereco endereco;
    
    public PessoaFisica(){
        this.endereco = new Endereco();
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + nome + " " + sobrenome + "\nCPF: " + cpf + endereco.toString();
    }

}
