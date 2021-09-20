package pratica.repeticao;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 100");
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
