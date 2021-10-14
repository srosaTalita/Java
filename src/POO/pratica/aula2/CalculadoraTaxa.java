package POO.pratica.aula2;

public class CalculadoraTaxa {

    private double saldo;
    private double taxaSaque = 1.30;
    private double taxaTransferencia = 0.001;

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
        valorTransf += (valorTransf * taxaTransferencia);
        saldo -= valorTransf;
        return (valorTransf);
    }

    public double taxaSaque(double valorSaque, int contador){ 
        if(contador % 5 == 0){
            valorSaque += (valorSaque + taxaSaque);
            saldo -= valorSaque;
            return valorSaque;
        }
        saldo -= valorSaque;
        return valorSaque;
    }

    public boolean saldoSuficiente(double valor){
        if(valor <= saldo())
            return true;
        return false;
    }

}
