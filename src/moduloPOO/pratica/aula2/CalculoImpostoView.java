package moduloPOO.pratica.aula2;

public class CalculoImpostoView {
    public static void main(String[] args) {
        CalculoImposto imposto = new CalculoImposto();

        System.out.printf("ISS: %.2f\n", imposto.calculoISS(2000)); 
        System.out.printf("IOF: %.2f\n", imposto.calculoIOF(2000)); 
        System.out.printf("IR: %.2f\n", imposto.calculoIR(2000)); 
    }
    
}