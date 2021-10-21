package model;

public class Endereco {
    
    public String cep;
    public String cidade;
    public String estado;

    @Override
    public String toString() {
        return "\nCEP: " +  cep + ", " + cidade + " - " + estado;
    }
}

