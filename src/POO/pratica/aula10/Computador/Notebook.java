package Computador;

public class Notebook extends Computador{
    
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        super.toString();
        return "\nBateria " + bateria + ", " + velocidadeWifi+ ", Bluettoth" + versaoBluetooth; 
    }
}
