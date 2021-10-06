package moduloPOO.pratica.aula6;

public class ContaCorrente extends Conta{
    
    private Double taxaTransferencia = 10.5;
    private Double taxaManuntencao = 2.5;
    private int numeroTransferencias = 0;

    public Double getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(Double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public Double getTaxaManuntencao() {
        return taxaManuntencao;
    }

    public void setTaxaManuntencao(Double taxaManuntencao) {
        this.taxaManuntencao = taxaManuntencao;
    }

    public int getNumeroTransferencias() {
        return numeroTransferencias;
    }

    public void setNumeroTransferencias(int numeroTransferencias) {
        this.numeroTransferencias = numeroTransferencias;
    }

    @Override
    public void transferencia(Double valor) {
        super.transferencia(valor);
        this.setSaldo(this.getSaldo() - taxaTransferencia);
        
        if(this.getNumeroTransferencias() % 5 == 0){
            this.setSaldo(this.getSaldo() - taxaManuntencao);
        }
    }
}
