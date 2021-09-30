package moduloPOO.pratica;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        CalculadoraTaxa ct = new CalculadoraTaxa();
        int opcao = menu();
        escolhaMenu(opcao, ct);
    }

    static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------\n1 - Saque\n2 - Transferência\n3 - Fechar conta\n-------------\n Escolha uma operação:");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static void escolhaMenu(int opcao, CalculadoraTaxa ct){
        double valor;
        int contador = 0;
        while(opcao != 3){
            switch(opcao){
                case 1:
                    contador += 1;
                    valor = valor("Valor do Saque: ");
                    System.out.printf("O valor debitado da conta foi: %.2f\n", ct.taxaSaque(valor, contador));
                    break;
                case 2:
                    valor = valor("Valor da Transferência: ");
                    System.out.printf("O valor debitado da conta foi: %.2f\n", ct.taxaTransferencia(valor));
                    break;
            }
            opcao = menu();
        }
        System.out.println("Conta fechada");
    }

    static double valor(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        double val = Double.parseDouble(sc.nextLine());
        return val;
    }
}
