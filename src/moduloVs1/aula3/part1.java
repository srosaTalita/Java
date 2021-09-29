package moduloVs1.aula3;
import java.util.*;

public class part1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char continua = 's';
        int opcao;

        while(continua == 's'){
            System.out.println("---------------\n1- Dev\n2- Linguagem\n---------------\nDigite uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            while(opcao < 1 || opcao > 2){
                System.out.println("Digite uma opção válida: ");
                opcao = Integer.parseInt(sc.nextLine());
            }

            switch (opcao) {
                case (1):
                    System.out.println("Opção Escolhida: Cadastrar Dev");
                    break;
                case (2):
                    System.out.println("Opção Escolhida: Cadastrar Linguagem");
                    break;
                }
            System.out.println("Deseja continuar? (Sim/Não)");
            continua = sc.nextLine().toLowerCase().charAt(0);
        }
    }
}
