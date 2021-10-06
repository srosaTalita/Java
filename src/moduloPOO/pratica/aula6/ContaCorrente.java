package moduloPOO.pratica.aula6;

public class ContaCorrente extends Conta{
    
    private Double taxaTransferencia;
    private Double taxaManuntencao;
    private int numeroTransferencias;

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
}
