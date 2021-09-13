package pratica;
import java.util.*;

public class CadastroProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("******** Cadastro de Produtos ********");
        System.out.println("Bem vindo(a), preencha as informações abaixo :)");

        System.out.println("Produto: ");
        String produto = sc.next();

        System.out.println("Descrição: ");
        String desc = sc.next();

        System.out.println("Valor: ");
        Double valor = sc.nextDouble();

        System.out.println("Categoria: ");
        String categoria = sc.next();

        System.out.println("Produto cadastrado com sucesso! \n");
        System.out.println("--- Resumo do produto ---");
        System.out.printf("Produto: %s \t Descrição: %s \t Valor: %f \t Categoria: %s"
                , produto, desc, valor, categoria);
    }
}
