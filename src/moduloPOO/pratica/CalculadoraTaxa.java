package moduloPOO.pratica;
import java.util.Scanner;

public class CalculadoraTaxa {

    private double saldo;

    public void fecharConta(){
        System.out.println("Conta fechada.");
    }

    public void depositar(double valor){
        saldo += valor; 
    }

    public double saldo(){
        return saldo;
    }
    
    public Double taxaTransferencia(double valorTransf){
        valorTransf += (valorTransf * 0.001);
        saldo -= valorTransf;
        return (valorTransf);
    }

    public double taxaSaque(double valorSaque, int contador){ 
        if(contador % 5 == 0){
            valorSaque += (valorSaque + 1.30);
            saldo -= valorSaque;
            return valorSaque;
        }
        saldo -= valorSaque;
        return valorSaque;
    }

    public boolean verificaSaldo(double valor){
        if(valor <= saldo())
            return true;
        return false;
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

}
