package aulas.aula32.controller;

import aulas.aula32.model.Pessoa;

public class PessoaController extends BaseController<Pessoa>{
    
    public PessoaController(){
        super("dados/pessoa.csv");
    }
}
