package Computador;

public class Desktop extends Computador{
    
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        super.toString();
        return "Gabinete:  " + tamanhoGabinete + " | Monitor Externo: " + monitorExterno + " | Fonte: " + fonte; 
    }
}
