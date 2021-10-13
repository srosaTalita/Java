package modulo1.aula6;

public class a6_2_semanal {
    public static void main(String[] args) {

        String nome = "";
        boolean valido = true;

        do {
            System.out.println("Nome: ");
            nome = "Lu";
            if (nome.length() < 3){
                System.out.println("No estas certo!");
                valido = false;
            }
        }while(!valido);
    }

}
