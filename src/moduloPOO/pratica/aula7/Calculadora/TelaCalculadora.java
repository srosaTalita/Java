package moduloPOO.pratica.aula7.Calculadora;

public class TelaCalculadora {
    
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        System.out.printf("Soma 2 ints: %d\n", c.soma(1, 2));
        System.out.printf("Soma 3 ints: %d\n", c.soma(1, 2, 3));
        System.out.printf("Soma 2 Doubles: %.2f\n", c.soma(1d, 2d));
        System.out.printf("Soma 3 Floats: %.2f\n", c.soma(1f, 2f, 3f));
    }
}
