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
        System.out.println("\n-------------\n1 - Saque\n2 - Transferência\n3 - Depósito\n4 - Consultar Saldo\n5 - Fechar conta\n-------------\nEscolha uma operação:");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static void escolhaMenu(int opcao, CalculadoraTaxa conta){
        double valor;
        int contador = 0;
        while(opcao != 5){
            switch(opcao){
                case 1:
                    contador += 1;
                    valor = conta.valor("Valor do Saque: ");
                    if(conta.verificaSaldo(valor)){
                        System.out.printf("O valor debitado da conta foi: %.3f\n", conta.taxaSaque(valor, contador));
                    }
                    else{
                        System.out.printf("Transação incompleta. Seu saldo é de %.3f reais", conta.saldo());
                    }
                    break;
                case 2:
                    valor = conta.valor("Valor da Transferência: ");
                    if(conta.verificaSaldo(valor)){
                        System.out.printf("O valor debitado da conta foi: %.3f\n", conta.taxaTransferencia(valor));
                    }
                    else{
                        System.out.printf("Transação incompleta. Seu saldo é de %.3f reais", conta.saldo());
                    }        
                    break;
                case 3:
                    valor = conta.valor("Valor do Depósito: ");
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
