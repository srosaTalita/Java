package moduloPOO.pratica;

public class CalculadoraTaxa {
    
    public Double taxaTransferencia(double valor){
        double valorTaxa = (valor * 0.001);
        return (valor + valorTaxa);
    }

    public double taxaSaque(double valor, int contador){   
        if(contador == 5)
            return (valor + 1.30);
        return valor;
    }

}
