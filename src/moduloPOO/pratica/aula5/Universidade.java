package moduloPOO.pratica.aula5;

public class Universidade {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Jake");
        f.setSobrenome("Silva");
        f.setMatricula("aaa111");
        f.setSalario(10000.00);
        f.setDepartamento("Programação");

        Coordenador c = new Coordenador();
        c.setNome("Linus");
        c.setSobrenome("Lopes");
        c.setMatricula("bbb222");
        c.setCursoCordenado("Engenharia");
        c.setBonus(12000.00);

        Aluno a = new Aluno();
        a.setNome("Luci");
        a.setSobrenome("Gomes");
        a.setMatricula("ccc333");
        a.setTurma("T3");
        a.setCurso("Inglês");

        System.out.printf("\nFuncionário:\n%s %s, %s\n", f.getNome(), f.getSobrenome(), f.getMatricula());
        System.out.printf("Sálario: %.2f | Departamento: %s\n", f.getSalario(), f.getDepartamento());
    
        System.out.printf("\nCoordenador:\n%s %s, %s\n", c.getNome(), c.getSobrenome(), c.getMatricula());
        System.out.printf("Curso Coordenado: %s | Bônus: %.2f\n", c.getCursoCordenado(), c.getBonus());
    
        System.out.printf("\nAluno:\n%s %s, %s\n", a.getNome(), a.getSobrenome(), a.getMatricula());
        System.out.printf("Turma: %s | Curso: %s\n", a.getTurma(), a.getCurso());
    }
}
