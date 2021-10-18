package Computador;

public class Computador {
    
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "Computador " + marca + ", " + memoriaRam + " de ram, processador " + processador + ", " + discoRigido; 
    }
}
