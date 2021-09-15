package pratica.condicional;
import java.sql.SQLOutput;
import java.util.*;

public class Netflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- Netflix - Cadastro --------------\n");
        System.out.println("1- Filmes \t 2- Séries \t 3- Documentário \t 4- Sair \nDigite uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case (1) :
                System.out.println("Nome: ");
                String movie = sc.nextLine();
                System.out.println("Descrição: ");
                String desc = sc.nextLine();
                System.out.println("Genero: ");
                String gender = sc.nextLine();
                System.out.println("Ano de lançamento: ");
                Short launchMovie = sc.nextShort();
                sc.nextLine();

                System.out.printf("Filme: %s, %s, %s, %d. Cadastrado com Sucesso!", movie, desc, gender, launchMovie);
                break;
            case(2) :
                System.out.println("Nome: ");
                String serie = sc.nextLine();
                System.out.println("Ano de Lançamento: ");
                Short launchSerie = sc.nextShort();
                sc.nextLine();
                System.out.println("Produtora: ");
                String prod = sc.nextLine();

                System.out.printf("Série: %s, %d, %s . Cadastrada com Sucesso!", serie, launchSerie, prod);
                break;
            case(3) :
                System.out.println("Nome: ");
                String doc = sc.nextLine();
                System.out.println("Ano de lançamento: ");
                Short launchDoc = sc.nextShort();
                sc.nextLine();
                System.out.println("Tema: ");
                String theme = sc.nextLine();

                System.out.printf("Documentário: %s, %d, %s . Cadastrado com Sucesso!", doc, launchDoc, theme);
                break;
            case(4) :
                System.out.println("Tchau :)");
                break;
        }

    }
}
