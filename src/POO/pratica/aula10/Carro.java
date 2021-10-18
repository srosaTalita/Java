public class Carro {
    
    public int nPortas;
    public String capacidadeMala;

    @Override
    public String toString() {
        return nPortas + " portas |  " + "Porta malas de " + capacidadeMala + ".";
    }
}
