package moduloVs1.aula2;

public class part2 {
    public static void main(String[] args) {        
        byte idade = 17;

        if(idade >= 18){
            System.out.println("Pode consumir drogas");
        }
        if(idade > 18 || idade == 18){
            System.out.println("Pode consumir drogas");
        }
        if(idade < 18){
            System.out.println("Pode consumir coca");
        }
    }
}
