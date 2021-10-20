package aula11;

public class Pessoa {
    
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa)obj;
        if(obj instanceof Pessoa){
            if(this.nome.equals(pessoa.nome) && this.sobrenome.equals(pessoa.sobrenome) && this.idade == pessoa.idade){
                return true;
            }
        }
        return false;
    }

}
