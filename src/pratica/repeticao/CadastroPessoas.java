package pratica.repeticao;
import java.util.*;

public class CadastroPessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("************** CadPes **************");
        do {
            System.out.println("---------------\n1- Clientes\n2- Listar Clientes\n3- Sair\n---------------\nDigite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case (1):
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    while (nome.length() < 3) {
                        System.out.println("Nome precisa ter no mínimo 3 caracteres!\nNome: ");
                        nome = sc.nextLine();
                    }

                    System.out.println("Sobrenome: ");
                    String sobrenome = sc.nextLine();
                    while (sobrenome.length() < 3) {
                        System.out.println("Sobrenome precisa ter no mínimo 3 caracteres!\nSobrenome: ");
                        sobrenome = sc.nextLine();
                    }

                    System.out.println("Rg: ");
                    String rg = sc.nextLine();
                    while (rg.length() < 4) {
                        System.out.println("Rg precisa ter no mínimo 4 caracteres!\nRG: ");
                        rg = sc.nextLine();
                    }

                    System.out.println("CPF: ");
                    String cpf = sc.nextLine();
                    while (cpf.length() < 11) {
                        System.out.println("CPF precisa ter no mínimo 11 caracteres!\nCPF: ");
                        cpf = sc.nextLine();
                    }
                    System.out.println("Cliente cadastrado com sucesso! ");
                    break;

                    case (2):
                        System.out.println("*Nenhum cliente por aqui*");
                        break;

                    default :
                        System.out.println("Volte sempre (◠‿・)—☆");
                        break;
                }
        }while(opcao != 3);
    }
}
