package moduloVs1.aula4;
import java.util.*;

public class part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        num = ler(sc);
        while(!validaPositivos(num)){
            System.out.println("Digite algo válido!");
            num = ler(sc);
        }        
    }

    private static int ler(Scanner sc) {
        System.out.println("Número: ");
        int dado = Integer.parseInt(sc.nextLine());
        return dado;
    }

    static boolean validaPositivos(int num){
        if(num < 0)
            return false;
            
        return true;
    }
    
}
