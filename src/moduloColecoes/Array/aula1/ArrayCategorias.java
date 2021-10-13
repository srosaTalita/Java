package moduloColecoes.Array.aula1;

import java.util.Scanner;

public class ArrayCategorias {

    public static void main(String[] args) {
        Categoria[] categorias = new Categoria[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < categorias.length; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Descrição: ");
            String desc = sc.next();
            
            Categoria c = new Categoria();
            c.setNome(nome);
            c.setNome(desc);

            categorias[i] = c;
        }
        
        for (Categoria cat : categorias) {
            System.out.printf("%s - %s", cat.getNome(), cat.getDesc());
        }
    }

}
