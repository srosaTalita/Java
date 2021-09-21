package modulo2.aula9;
import java.util.*;
// 21/09/2021
// Funções, métodos e procedimentos

public class a9_1_metodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Segundo número: ");
        int n2 = Integer.parseInt(sc.nextLine());

        int r = sum(n1, n2);
        System.out.println(r);
    }

    static void head(){
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------- Calculator -----------------------");
        System.out.println("----------------------------------------------------------");
    }

    static void menu(){
        System.out.println("\t 1- Soma");
        System.out.println("\t 2- Subtração");
        System.out.println("\t 3- Multilicação");
        System.out.println("\t 4- Divisão");
    }

    static int sum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
