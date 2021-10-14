package POO.pratica.aula5;

public class Coordenador extends Funcionario{
    
    private String cursoCordenado;
    private Double bonus;

    public String getCursoCordenado() {
        return cursoCordenado;
    }

    public void setCursoCordenado(String cursoCordenado) {
        this.cursoCordenado = cursoCordenado;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
