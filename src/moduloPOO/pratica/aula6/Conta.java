package moduloPOO.pratica.aula6;

public class Conta {
    
    private Double saldo;
    private String codigoCliente;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void transferencia(Double valor){
        saldo -= valor;
    }
}
