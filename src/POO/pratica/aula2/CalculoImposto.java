package POO.pratica.aula2;

public class CalculoImposto {

    private double taxaISS = 0.05;
    private double taxaIOF = 0.063;
    private double taxaIR = 0.15;
    
    public double calculoISS(double valor){
        double imposto = valor * taxaISS;
        return imposto;
    }

    public double calculoIOF(double valor){
        double imposto = valor * taxaIOF;
        return imposto;
    }

    public double calculoIR(double valor){
        double imposto = valor * taxaIR;
        return imposto;
    }
}
