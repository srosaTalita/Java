package modulo2.aula9;
import java.util.*;
// 21/09/2021
// Funções, métodos e procedimentos

public class a9_1_metodos {

    static Scanner sc = new Scanner(System.in);

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
        System.out.println("\t 5- Sair");
    }

    static void chooseMenu(){
        int resultOp = 0;
        int option = readNumber("Opção: ");
        int number1 = readNumber("Primeiro número: ");
        int number2 = readNumber("Segundo número: ");

        switch (option){
            case(1) :
                resultOp = sum(number1, number2);
                break;

            case(2) :
                resultOp = subtraction(number1, number2);
                break;

            case(3) :
                resultOp = multiplication(number1, number2);
                break;

            case(4) :
                resultOp = division(number1, number2);
                break;

            case(5) :
                return;
        }
        System.out.printf("O resultado da operação é %d", resultOp);
    }

    static int readNumber(String message){
        System.out.println(message);
        int number = Integer.parseInt(sc.nextLine());
        return number;
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    static int division(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        head();
        menu();
        chooseMenu();
    }
}
