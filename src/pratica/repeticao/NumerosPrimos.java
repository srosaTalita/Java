package pratica.repeticao;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 até a 150");

        for (int i = 1; i <= 150; i++){ // vai pegar um numero de cada vez :)
            int contador = 0;

            for (int j = 1; j <= i; j++) { //vai dividir o numero por ele mesmo e pelos anteriores
                if (i % j == 0) {
                    contador++; //conta quantas vezes foi dividido
                }
            }

            if (contador == 2) { //se foi dividido por mais de dois numeros ele não é primo
                System.out.println(i);
            }
        }
    }
}
