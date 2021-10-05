package moduloPOO.pratica.aula5;

public class Funcionario extends Pessoa{
    
    private Double salario;
    private String departamento;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
