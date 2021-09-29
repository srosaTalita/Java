package moduloVs1.aula4;
import java.util.*;

public class part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = read(sc);
        while(!positiveValidation(num)){
            System.out.println("Digite algo válido!");
            num = read(sc);
        }        
    }

    private static int read(Scanner sc) {
        System.out.println("Número: ");
        int data = Integer.parseInt(sc.nextLine());
        return data;
    }

    static boolean positiveValidation(int num){
        if(num < 0)
            return false;           
        return true;
    }

    static boolean menuValidation(int num){
        if(num < 0 || num > 5){
            System.out.println("Opção Inválido! Digite novamente: ");
            return false;
        }
        return true;
    }
    
}
