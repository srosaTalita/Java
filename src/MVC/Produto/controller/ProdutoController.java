package Produto.controller;
import java.util.*;

import Produto.model.Produto;

public class ProdutoController {
    
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void salvar(Produto p){
        produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return produtos;
    }
    
}
