package pratica;

import java.util.Scanner;

public class VoceEscolhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.printf("%dº usuario cadastrado %s %s!\n", i, nome, sobrenome);
        }

    }
}
