package moduloPOO.pratica.aula7;

public class ContaCorrente {
    
    private Double saldo;
    private Double taxaSaque = 1.0;
    private String codigoCliente;

    public ContaCorrente(Double saldo, String codigoCliente){   
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public void saque(Double valor){
        saldo -= valor + taxaSaque;
    }
    
    public void deposito(Double valor){
        saldo += valor;
    }

    @Override
    public String toString() {
        return "\nCliente: " + this.codigoCliente + "\nTaxa Saque: " + this.taxaSaque + "\nSaldo: " + this.saldo + "\n";
    }
}
