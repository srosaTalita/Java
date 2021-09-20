package pratica.repeticao;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 até a 150");
        for (int i = 1; i <= 150; i++){
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    }
}
