package POO.pratica.aula7.Banco;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(50.0, "C235");
        cc.saque(20.0);
        cc.deposito(5.0);
        System.out.println(cc);
    }
}
