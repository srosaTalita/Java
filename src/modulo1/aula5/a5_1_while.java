package modulo1.aula5;
import java.util.*;

public class a5_1_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invalid = true;

        do{
            System.out.println("Nome do produto: ");
            String nome = sc.nextLine();
            if( nome.length() < 5 ){
                System.out.println("O nome deve ter mais que 5 caracteres!");
            }
            else{
                invalid = false;
            }
        }while(invalid);
    }
}
