package modulo2.pratica.metodos;

import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);

    static double readNumber(String message){
        System.out.println(message);
        double number = Integer.parseInt(sc.nextLine());
        return number;
    }

    static double sum(double num1, double num2){
        return num1 + num2;
    }

    static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    static double division(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {

        double n1 = readNumber("Primeiro número: ");
        double n2 = readNumber("Segundo número: ");
        double rSum = sum(n1, n2);
        double rSub = subtraction(n1, n2);
        double rMul = multiplication(n1, n2);
        double rDiv = division(n1, n2);
        System.out.printf("%f + %f = %f", rSum);
        System.out.printf("%f - %f = %f", rSub);
        System.out.printf("%f * %f = %f", rMul);
        System.out.printf("%f / %f = %f", rDiv);
    }
}
