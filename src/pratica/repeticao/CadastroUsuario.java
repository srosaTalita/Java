package pratica.repeticao;
import java.util.*;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- CadUser ----------");
        System.out.println("Quantos usuarios deseja cadastrar? ");
        int numUser = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numUser; i++){
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.println("User cadastrada(o) com sucesso!");
        }
    }
}
