package moduloVs1.aula3;

public class part2 {

    public static void main(String[] args) {
        int s = soma(15, 37);
        s += soma(22, 58);
        s += soma(85, 35);
        System.out.println(s / 3);
    }

    static int soma(int n1, int n2){
        return n1 + n2;
    }
}
