package POO.pratica.aula6;

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

    private int getNumeroTransferencias() {
        return numeroTransferencias;
    }

    private void setNumeroTransferencias(int numeroTransferencias) {
        this.numeroTransferencias = numeroTransferencias;
    }

    @Override
    public void transferencia(Double valor) {
        super.transferencia(valor);
        this.setSaldo(this.getSaldo() - taxaTransferencia);

        this.setNumeroTransferencias(this.getNumeroTransferencias() + 1);
        if(this.getNumeroTransferencias() % 5 == 0){
            this.setSaldo(this.getSaldo() - taxaManuntencao);
        }
    }
}
