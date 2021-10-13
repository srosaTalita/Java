package moduloColecoes.Array.pratica.Pessoa;

import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        PessoaFisica[] pessoas = new PessoaFisica[5];
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Norberto");
        pf1.setSobrenome("Souza");
        pf1.setCodigo("a1");
        pf1.setRg("00000000-00");
        pf1.setCpf("000.000.000-00");
        pf1.setIdade(18);
        pessoas[0] = pf1;

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("Arya");
        pf2.setSobrenome("Silva");
        pf2.setCodigo("b2");
        pf2.setRg("11111111-11");
        pf2.setCpf("111.111.111-11");
        pf2.setIdade(19);
        pessoas[1] = pf2;

        PessoaFisica pf3 = new PessoaFisica();
        pf3.setNome("Azura");
        pf3.setSobrenome("Oliveira");
        pf3.setCodigo("c3");
        pf3.setRg("22222222-22");
        pf3.setCpf("222.222.222-22");
        pf3.setIdade(20);
        pessoas[2] = pf3;

        PessoaFisica pf4 = new PessoaFisica();
        pf4.setNome("Pan");
        pf4.setSobrenome("Santos");
        pf4.setCodigo("d4");
        pf4.setRg("33333333-33");
        pf4.setCpf("333.333.333-33");
        pf4.setIdade(21);
        pessoas[3] = pf4;

        PessoaFisica pf5 = new PessoaFisica();
        pf5.setNome("Harry");
        pf5.setSobrenome("Carvalho");
        pf5.setCodigo("e5");
        pf5.setRg("44444444-44");
        pf5.setCpf("444.444.444-44");
        pf5.setIdade(22);
        pessoas[4] = pf5;

        for (PessoaFisica pf : pessoas) {
            System.out.printf("\n%s %s, %d anos", pf.getNome(), pf.getSobrenome(), pf.getIdade());
            System.out.printf("\nCodigo: %s\nRg: %s\nCPF: %s\n", pf.getCodigo(), pf.getRg(), pf.getCpf());
        }
    }
}
