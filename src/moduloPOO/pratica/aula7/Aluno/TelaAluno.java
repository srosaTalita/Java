package moduloPOO.pratica.aula7.Aluno;

public class TelaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Harry");
        a1.setMatricula("a0b1");
        a1.setIdade(11);
        //Funcionalidade do método toString sobrescrito na classe Aluno:
        System.out.println(a1);

        Aluno a2 = new Aluno();
        a2.setNome("Ron");
        a2.setIdade(12);
        a2.setMatricula("c2d3");
        //Funcionalidade do método toString sobrescrito na classe Aluno:
        System.out.println(a2);
    }
}
