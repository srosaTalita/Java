package pratica.ATP30;

import java.util.Scanner;

public class Calculadora {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head();
        menu();
        int option = 0;
        boolean invalido;
        do{
            try{
                option = readNumber("Opção: ");
                invalido = false;
                if(option < 1 || option > 5){
                    throw new IllegalArgumentException("Opção Inválida!");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Opcão Inválida!");
                invalido = true;
            }
        }while(invalido);
        chooseMenu(option);        
    }
    
    static void head(){
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------- Calculadora ----------------------");
        System.out.println("----------------------------------------------------------");
    }

    static void menu(){
        System.out.println("\t 1- Soma");
        System.out.println("\t 2- Subtração");
        System.out.println("\t 3- Multilicação");
        System.out.println("\t 4- Divisão");
        System.out.println("\t 5- Sair");
    }

    static void chooseMenu(int option){
        int n1, n2, resultOp = 0;      

        switch (option){
            case(1) :
                n1 = readNumber("Primeiro número: ");
                n2 = readNumber("Segundo número: ");
                resultOp = sum(n1, n2);
                break;

            case(2) :
                n1 = readNumber("Primeiro número: ");
                n2 = readNumber("Segundo número: ");
                resultOp = subtraction(n1, n2);
                break;

            case(3) :
                n1 = readNumber("Primeiro número: ");
                n2 = readNumber("Segundo número: ");
                resultOp = multiplication(n1, n2);
                break;

            case(4) :
                n1 = readNumber("Primeiro número: ");
                n2 = readNumber("Segundo número: ");
                resultOp = division(n1, n2);
                break;

            case(5) :
                System.out.println("Até mais");
                return;
        }
        System.out.printf("O resultado da operação é %d", resultOp);
    }

    static int readNumber(String message){
        System.out.println(message);
        int number;
        try{
            number = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException e){
            System.out.printf("Erro: %s\n", e.getMessage()); // mostra o erro gerado
            System.out.println("Precisa ser um número inteiro!");
            number = readNumber(message);
        }
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
        int div;
        try {
            div = num1 / num2; 
        } 
        catch (ArithmeticException e) {
            System.out.printf("\nErro: %s\n", e.getMessage()); // mostra o erro gerado
            System.out.println("Divisor não pode ser 0!");
            num2 = readNumber("Segundo número: ");
            div = division(num1, num2);
        }
        return div;
    }
}
