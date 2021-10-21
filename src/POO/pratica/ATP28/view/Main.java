package view;

import model.PessoaFisica;
import model.PessoaJuridica;
import controller.PFController;
import controller.PJController;

public class Main {
   
    public static void main(String[] args) {
        
        PFController pFisicaC = new PFController();
        PJController pJuridicaC = new PJController();

        PessoaFisica pf = new PessoaFisica();
        pf.id = 1;
        pf.nome = "Jim";
        pf.sobrenome = "Halpert";
        pf.cpf = "000.000.000-00";
        pf.endereco.cep = "00000-000";
        pf.endereco.cidade = "Scranton";
        pf.endereco.estado = "Pensilvânia";

        PessoaJuridica pj = new PessoaJuridica();
        pj.id = 1;
        pj.nome = "Dunder Mifflin";
        pj.cnpj = "00.000.000/0000-00";
        pj.endereco.cep = "00000-000";
        pj.endereco.cidade = "Scranton";
        pj.endereco.estado = "Pensilvânia";

        System.out.println("------------ Criou uma pessoa fisica e uma jurídica ------------");

        pFisicaC.create(pf);
        pJuridicaC.create(pj);
        pFisicaC.show(pFisicaC.read());
        System.out.println("\n");
        pJuridicaC.show(pJuridicaC.read());

        System.out.println("------------ Atualizou a pessoa fisica ------------");
        
        PessoaFisica pf2 = new PessoaFisica();
        pf.id = 1;
        pf.nome = "Dwight";
        pf.sobrenome = "Schrute";
        pf.cpf = "000.000.000-00";
        pf.endereco.cep = "00000-000";
        pf.endereco.cidade = "Scranton";
        pf.endereco.estado = "Pensilvânia";

        pFisicaC.update(pf2);
        pFisicaC.show(pFisicaC.read());
        System.out.println("\n");
        pJuridicaC.show(pJuridicaC.read());

        System.out.println("------------ Removeu a pessoa fisica ------------");

        pFisicaC.delete(pf);
        pFisicaC.show(pFisicaC.read());
        System.out.println("\n");
        pJuridicaC.show(pJuridicaC.read());
    }
}
