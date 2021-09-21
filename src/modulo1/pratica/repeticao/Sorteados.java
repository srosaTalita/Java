package modulo1.pratica.repeticao;
import java.util.*;

public class Sorteados {

    public static void main(String[] args) {
        ArrayList sorteados = new ArrayList();
        Random random = new Random();
        while(sorteados.size() < 1){
            int sorteado = random.nextInt(100);
            if(!sorteados.contains(sorteado)){
                sorteados.add(sorteado);
            }
        }
        System.out.println(sorteados);
    }
}
