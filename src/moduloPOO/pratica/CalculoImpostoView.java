package moduloPOO.pratica;

public class CalculoImpostoView {
    public static void main(String[] args) {
        CalculoImposto imposto = new CalculoImposto();

        System.out.println(imposto.calculoISS(2000)); 
        System.out.println(imposto.calculoIOF(2000)); 
        System.out.println( imposto.calculoIR(2000)); 
    }
    
}