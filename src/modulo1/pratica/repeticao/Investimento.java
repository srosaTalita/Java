package modulo1.pratica.repeticao;

public class Investimento {
    public static void main(String[] args) {
        double valor = 5000;
        for (int i = 0; i < 24; i++) {
            valor += (valor * 0.02);
            System.out.printf("No %dº mês o retorno foi de %.2f  reais\n", i+1, valor);
        }
    }
}
