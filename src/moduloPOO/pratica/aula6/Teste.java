package moduloPOO.pratica.aula6;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(50.0);
        Double saldoAntigo = conta.getSaldo();
        conta.setCodigoCliente("aaa111");
        conta.transferencia(20.0);

        System.out.printf("\nCliente: %s | Saldo Antigo: %.2f\nSaldo atual: %.2f\n", conta.getCodigoCliente(), saldoAntigo, conta.getSaldo());

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(50.0);
        Double saldoAntigoC = conta.getSaldo();
        cc.setCodigoCliente("bbb222");
        cc.transferencia(20.0);

        System.out.printf("\nCliente: %s | Saldo Antigo: %.2f\nSaldo atual: %.2f\n", cc.getCodigoCliente(), saldoAntigoC, cc.getSaldo());
    }
}
