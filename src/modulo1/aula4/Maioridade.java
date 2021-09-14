package modulo1.aula4;

import java.util.*;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*********** Cadastro de Pessoas ***********");
        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        Short idade = sc.nextShort();

        if (idade >= 18){
            System.out.printf("%s, %d anos, foi cadastrada(o) com sucesso!", nome, idade);
        }
        else{
            System.out.printf("Volte daqui a %d anos", (18 - idade));
        }

    }
}
