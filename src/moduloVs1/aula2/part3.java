package moduloVs1.aula2;

public class part3 {
    public static void main(String[] args) {

        for (int linha = 0; linha <= 9; linha++) {
            System.out.printf("\n%d - ", linha);

            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.printf("%d ", coluna + linha);
            }
        }
    }
    
}
