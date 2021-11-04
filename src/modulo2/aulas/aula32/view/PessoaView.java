package aulas.aula32.view;

import aulas.aula32.controller.PessoaController;
import aulas.aula32.model.Pessoa;

public class PessoaView {
    
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();

        p1.id = 1;
        p1.nome = "Harry";
        p1.sobrenome = "Styles";
        pc.create(p1);

        for (Pessoa p : pc.read()) {
            System.out.println(p);
        }
    }
}
