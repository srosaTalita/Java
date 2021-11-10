package pratica.ATP38.view;

import java.io.*;

public class Escrita {
    
    public static void main(String[] args) {
        
        try {
            FileOutputStream fos = new FileOutputStream("dados/pratos.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Macarrão");
            bw.newLine();
            bw.write("Salada");
            bw.close();

        } 
        catch (FileNotFoundException f) {
            System.out.println("Arquivo não encontrado :/");
        } 
        catch (IOException e) {
           System.out.println("Não foi possível escrever no arquivo :/");
        }
    }
}
