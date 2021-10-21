package model;

public class PessoaJuridica extends Base{
    
    public String nome;
    public String cnpj;
    public Endereco endereco;
    
    public PessoaJuridica(){
        this.endereco = new Endereco();
    }

    @Override
    public String toString() {
        return super.toString() + " - " + nome + "\nCNPJ: " + cnpj + endereco.toString();
    }

}
