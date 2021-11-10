package pratica.ATP39.view;

import java.io.*;

public class EscritaLeitura {
    
    public static void main(String[] args) {
        
        try {
            InputStream fis = System.in;
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("ATP39/dados/mercado.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = "";
            while(linha != null && !linha.equals("s")){
                linha = br.readLine();
                bw.write(linha);
                bw.newLine();
            }
            bw.close();
            br.close();

        } 
        catch (FileNotFoundException f) {
            System.out.println("Arquivo não encontrado :/");
        } 
        catch (IOException e) {
           System.out.println("Não foi possível escrever no arquivo :/");
        }
    }
}
