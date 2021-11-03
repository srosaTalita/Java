package pratica.ATP31.view;

import java.util.Scanner;

import pratica.ATP31.controller.ProdutosController;
import pratica.ATP31.model.Produtos;

public class Main {

    static ProdutosController prodC = new ProdutosController();
    public static void main(String[] args) {
        head();
        do{
            menu();
            int option = menuValidation();
            chooseMenu(option); 
        }while(proceedMenu());
    }

    static boolean proceedMenu(){
        boolean valid, proceed = true;
        do{
            try{
                char answer = readChar("Deseja voltar ao menu? (sim/não)");
                if(answer == 'S'){
                    proceed = true;
                }
                else if(answer == 'N'){
                    proceed = false;
                }
                else{
                    throw new IllegalArgumentException("Opcão Inválida");
                }
                valid = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                valid = false;
            }
        }while(!valid);

        return proceed;
    }

    
    static void head(){
        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Cadastro de Produtos ------------------");
        System.out.println("----------------------------------------------------------");
    }
    
    static void menu(){
        System.out.println("\t 1- Cadastrar Produto");
        System.out.println("\t 2- Listar Produtos");
        System.out.println("\t 3- Atualizar Produto");
        System.out.println("\t 4- Remover Produto");
        System.out.println("\t 5- Sair");
    }
    
    static int menuValidation() {
        boolean valido;
        int option = 0;
        do{
            try{
                option = readInt("Opção: ");
                valido = true;
                if(option < 1 || option > 5){
                    throw new IllegalArgumentException("Opção Inválida!");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Opcão Inválida!");
                valido = false;
            }
        }while(!valido);
        return option;
    }

    static void chooseMenu(int option){    
        Produtos prod;

        switch (option){

            case(1) :
                prod = new Produtos();
                prod.id = readInt("ID Produto: ");
                prod.nome = readString("Nome: ");
                prod.valor = readString("Preço: ");
                prod.categoria.marca = readString("Marca: ");
                prod.categoria.tipo = readString("Tipo: ");
                prodC.create(prod);
                break;

            case(2) :
                System.out.println("---------- Lista de Produtos ----------");
                for (Produtos prod2: prodC.read()) {
                    System.out.println(prod2);
                }
                break;

            case(3) :
                prod = new Produtos();
                prod.id = readInt("ID Produto: ");
                prod.nome = readString("Nome: ");
                prod.valor = readString("Preço: ");
                prod.categoria.marca = readString("Marca: ");
                prod.categoria.tipo = readString("Tipo: ");
                prodC.update(prod);
                break;

            case(4) :
                prod = new Produtos();
                prod.id = readInt("ID Produto: ");
                break;

            case(5) :
                System.out.println("Até mais");
                return;
        }
    }

    static int readInt(String message){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean valido;
        do{
            try{
                System.out.println("\n" + message);
                number = Integer.parseInt(sc.nextLine());
                valido = true;
            }
            catch(NumberFormatException e){
                System.out.printf("Erro: %s\nPrecisa ser um número inteiro!", e.getMessage());
                valido = false;
            }
        }while(!valido);
        return number;
    }

    static String readString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String info = sc.nextLine();
        return info;
    }

    static char readChar(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        char caractere = sc.nextLine().toUpperCase().charAt(0);
        return caractere;
    }

}
