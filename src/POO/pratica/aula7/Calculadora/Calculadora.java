package POO.pratica.aula7.Calculadora;

public class Calculadora {

    //Sobrecarga de métodos:
    
    public int soma(int n1, int n2){
        return n1 + n2;
    }
    
    public Double soma(Double n1, Double n2){
        return n1 + n2;
    }
    
    public float soma(float n1, float n2, float n3){
        return n1 + n2 + n3;
    }

    public long soma(long n1, long n2, long n3){
        return n1 + n2 + n3;
    }
}
