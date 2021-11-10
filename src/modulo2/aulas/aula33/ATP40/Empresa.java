package aulas.aula33.ATP40;

public class Empresa {
    
    public String nome;
    public String cnpj;
    public String ramo;
    public String atividade;

    public Empresa(){ //sobrecarga de métodos (1)
        super();
    }

    @Override
    public String toString(){
        String retorno = String.format("%s;%s;%s;%s;", this.nome, this.cnpj, this.ramo, this.atividade);
        return retorno;
    }

}
