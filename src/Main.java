import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Olá " + nome + " " + sobrenome + ", Seja bem vindo(a)!");

    }
}
