package moduloVs1.aula2;

public class part1 {
    public static void main(String[] args) {
        boolean executa = false;
        if(executa){
           System.out.println("Entrou no if"); 
        }

        boolean verdade = true;
        if(!verdade){
           System.out.println("Entrou no segundo if"); 
        }

        if(!verdade || executa){
           System.out.println("Entrou no terceiro if"); 
        }

        if(verdade && !executa){
            System.out.println("Entrou no quarto if"); 
        }     

        boolean resultado = verdade && !executa;

    }   
}
