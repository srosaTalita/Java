package view;

import java.io.*;

public class Leitura {
    
    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("dados/pratos.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
        }
        catch(FileNotFoundException f){
            System.out.println("Arquivo não foi encontrado :(");
        }
        catch(IOException f){
            System.out.println("Não foi possível ler o arquivo :(");
        }
    }
}
