package moduloColecoes.pratica;

public class Numeros {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 10;
            System.out.printf("%d° Posição: %d\n", i, numeros[i]);
        }

    }
}
