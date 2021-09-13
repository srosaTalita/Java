package modulo1.aula3;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Clientes");
        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("Idade: ");
        short idade = sc.nextShort();

        System.out.printf("O cliente %s, %d anos, foi cadastrado com sucesso!", nome, idade);

    }
}
