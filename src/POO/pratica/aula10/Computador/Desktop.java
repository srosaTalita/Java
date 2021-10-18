package Computador;

public class Desktop extends Computador{
    
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "Computador " + marca + ", " + memoriaRam + " de ram, processador " + processador + ", " + discoRigido + "\nGabinete:  " + tamanhoGabinete + " | Monitor Externo: " + monitorExterno + " | Fonte: " + fonte; 
    }
}
