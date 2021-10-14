package view;
import model.Produto;
import controller.ProdutoController;
import java.util.*;

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
