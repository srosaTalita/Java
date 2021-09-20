package pratica.repeticao;

import java.util.*;

public class RepeteNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = sc.nextLine();
        int contador = 0;

        while(contador < 10){
            System.out.printf("%d - Olá %s %s\n", contador + 1, nome, sobrenome);
            contador ++;
        }

        for (int i = 0; i < contador; i++){
            System.out.printf("%d - Olá %s %s\n", i + 1, nome, sobrenome);
        }

    }
}
