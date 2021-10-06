package moduloPOO.pratica.aula2;
import java.util.Scanner;

import moduloPOO.pratica.aula2.CalculadoraTaxa;

public class Banco {
    public static void main(String[] args) {
        CalculadoraTaxa ct = new CalculadoraTaxa();
        int opcao = menu();
        escolhaMenu(opcao, ct);
    }

    static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------\n1 - Saque\n2 - Transferência\n3 - Depósito\n4 - Consultar Saldo\n5 - Fechar conta\n-------------\nEscolha uma operação:");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static double valor(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        double val = Double.parseDouble(sc.nextLine());
        
        while(!validaValor(val)){
            System.out.println("Valor Inválido! Digite novamente: ");
            val = Double.parseDouble(sc.nextLine());
        }
        return val;
    }

    static boolean validaValor(double valor){
        if(valor <= 0.0)
            return false;
        return true;
    }

    static void escolhaMenu(int opcao, CalculadoraTaxa conta){
        double valor;
        int contador = 0;
        while(opcao != 5){
            switch(opcao){
                case 1:
                    contador += 1;
                    valor = valor("Valor do Saque: ");
                    if(conta.saldoSuficiente(valor)){
                        System.out.printf("O valor debitado da conta foi: %.3f\n", conta.taxaSaque(valor, contador));
                    }
                    else{
                        System.out.printf("Transação incompleta. Seu saldo é de %.3f reais", conta.saldo());
                    }
                    break;
                case 2:
                    valor = valor("Valor da Transferência: ");
                    if(conta.saldoSuficiente(valor)){
                        System.out.printf("O valor debitado da conta foi: %.3f\n", conta.taxaTransferencia(valor));
                    }
                    else{
                        System.out.printf("Transação incompleta. Seu saldo é de %.3f reais", conta.saldo());
                    }        
                    break;
                case 3:
                    valor = valor("Valor do Depósito: ");
                    conta.depositar(valor);
                    System.out.println("Depósito feito com sucesso!");
                    break;
                case 4:
                    System.out.printf("Seu saldo é de %.3f reais.", conta.saldo());
                    break;
            }
            opcao = menu();
        }
        conta.fecharConta();
    }

}
