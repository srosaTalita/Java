package Computador;

public class Notebook extends Computador{
    
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        return "Computador " + marca + ", " + memoriaRam + " de ram, processador " + processador + ", " + discoRigido + "\nBateria " + bateria + ", " + velocidadeWifi+ ", Bluettoth" + versaoBluetooth; 
    }
}
