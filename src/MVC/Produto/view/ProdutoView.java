package Produto.view;
import java.util.*;

import Produto.controller.ProdutoController;
import Produto.model.Produto;

public class ProdutoView {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("Tv", 2800d);

        ProdutoController controller = new ProdutoController();
        controller.salvar(p);
        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods ) {
            System.out.println(prodSalvo);
        }

    }
}
