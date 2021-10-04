package moduloColecoes;

public class ArrayString {
    public static void main(String[] args) {
        String[] nomes = new String[2];
        nomes[0] = "Luci";
        nomes[1] = "Lucio";
    
        for(String nome : nomes){
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    } 
}
