package POO.aula1;

import java.util.ArrayList;

public class a1 { 
    public static void main(String[] args) {
        ArrayList<Produto> produtosLista = new ArrayList<>();

        Produto p = new Produto();
        p.nome = "Tv";
        p.descricao = "80 polegadas";
        p.valor = 15.000;
        produtosLista.add(p);
        
        showArray(produtosLista);
    }

    private static void showArray(ArrayList<Produto> lista) {
        for (Produto produto : lista) {
            System.out.println(produto.nome);
            System.out.println(produto.descricao);
            System.out.println(produto.valor);
        }
    }
}
