package Veiculo;
public class Veiculo {
    
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return placa + ": " + marca + ", " + modelo;
    }
}
