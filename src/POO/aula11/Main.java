package POO.aula11;

import aula11.Pessoa;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Luci";
        p1.sobrenome = "Rosa";
        p1.idade = 2;

        Pessoa p2 = new Pessoa();
        p2.nome = "Luci";
        p2.sobrenome = "Rosa";
        p2.idade = 3;

        Pessoa p3 = new Pessoa();
        p3.nome = "Luci";
        p3.sobrenome = "Rosa";
        p3.idade = 2;
        
        boolean igual = p1.equals(p2);
        System.out.println(igual);

        Aluno a = new Aluno();
        a.nome = "Luci";
        a.sobrenome = "Rosa";
        a.idade = 2;
        a.curso = "Eng";
        a.turma = "T3";
        a.matricula = "T2HJ";

        bollean igualPA = p1.equals(a);
        System.out.println(igualPA);
    }
}
