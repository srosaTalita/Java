package moduloPOO.pratica.aula4;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setCodigo("abc123");
        conta.setAgencia(0001);
        conta.setNumero(63587);
        conta.setSaldo(10000.00);

        String codigo = conta.getCodigo();
        int agencia = conta.getAgencia();
        int numero = conta.getNumero();
        Double saldo = conta.getSaldo();

        System.out.printf("Código: %s | Agência: %d | Número: %d | Saldo: %.2f reais.", codigo, agencia, numero, saldo);
    }   
}
