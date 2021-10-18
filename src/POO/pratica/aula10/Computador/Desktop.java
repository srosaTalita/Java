package Computador;

public class Desktop {
    
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "Gabinete:  " + tamanhoGabinete + " +| Monitor Externo: " + monitorExterno + " | Fonte: " + fonte; 
    }
}
