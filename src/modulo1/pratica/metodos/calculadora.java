package modulo1.pratica.metodos;

import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);

    static double readNumber(String message){
        System.out.println(message);
        double number = Double.parseDouble(sc.nextLine());
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

    static void printResult(double number1, double number2, char sign, double result) {
        System.out.printf("%.2f %s %.2f = %.2f\n", number1, sign, number2, result);
    }

    public static void main(String[] args) {

        double n1 = readNumber("Primeiro número: ");
        double n2 = readNumber("Segundo número: ");
        double rSum = sum(n1, n2);
        double rSub = subtraction(n1, n2);
        double rMul = multiplication(n1, n2);
        double rDiv = division(n1, n2);

        printResult(n1, n2, '+', rSum);
        printResult(n1, n2, '-', rSub);
        printResult(n1, n2, '*', rMul);
        printResult(n1, n2, '/', rDiv);
    }
}
