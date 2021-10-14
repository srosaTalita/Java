package POO.pratica.aula4.Loja;

public class Produto {
    
    private String codigo;
    private String nome;
    private String desc;
    private Double valor;

    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
}
