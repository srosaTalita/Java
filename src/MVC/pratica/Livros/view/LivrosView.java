package pratica.Livros.view;
import java.util.*;

import pratica.Livros.controller.LivrosController;
import pratica.Livros.model.Livros;

public class LivrosView {  

    private static LivrosController controller = new LivrosController();
    private static Livros livro = new Livros();
    public static void main(String[] args) {
        int op;
        do{
            cabecalho();
            op = entradaInt("Escolha uma opção: ");
            menu(op);
        }while(op != 5);
    }

    public static void cabecalho(){
        System.out.println("\n---------- Biblioteca ----------");
        System.out.println("1- Cadastrar Livro\n2- Listar Livro\n3- Substituir Livro\n4- Remover Livro\n5- Sair");
        System.out.println("--------------------------------");
    }

    public static void menu(int op){
        
        switch (op) {
            case (1):
                Livros novoLivro = infoLivro();
                controller.create(novoLivro);
                System.out.println("Livro Cadastrado com sucesso!");
                break;

            case (2):
                controller.read();
                break;

            case (3):
                Livros livroAtualizado = infoLivro();
                controller.update(livroAtualizado);
                System.out.println("Livro Atualizado com sucesso!");
                break;

            case (4):
                int idLivro = entradaInt("Qual livro deseja remover (Número do livro): ");
                controller.delete(idLivro);
                System.out.println("Livro Removido com sucesso!");
                break;
        
            default:
                break;
        }
    }

    public static int entradaInt(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static String entradaString(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        String info = sc.nextLine();
        return info;
    }

    public static Livros infoLivro(){     
        String nome = entradaString("\nNome do Livro: ");
        String genero = entradaString("\nGênero do Livro: ");
        int ano = entradaInt("\nAno de Lançamento: ");

        livro.setId(livro.createId());
        System.out.println(livro.getId());
        livro.setNome(nome); 
        livro.setGenero(genero);
        livro.setAno(ano);
        return livro;
    }
}
