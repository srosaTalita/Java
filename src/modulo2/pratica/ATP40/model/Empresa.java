package pratica.ATP40.model;

public class Empresa extends Base{
    
    public String nome;
    public String cnpj;
    public String ramo;
    public String atividade;

    //sobrecargar de métodos (1)
    public Empresa(){
        super();
    }

    //sobrecarga de métodos (2)
    public Empresa(String empresaStr){  //Pega a STring no formato original, separa e converte para objeto
        String lista[] = empresaStr.split(";");
        this.id = Integer.parseInt(lista[0]);
        this.nome = lista[1];
        this.cnpj = lista[2];
        this.ramo = lista[3];
        this.atividade = lista[4];    
    }

    @Override
    public String toString(){
        String retorno = String.format("%s;%s;%s;%s;%s;", this.id, this.nome, this.cnpj, this.ramo, this.atividade);
        return retorno;
    }
}
