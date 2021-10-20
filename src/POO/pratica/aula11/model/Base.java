package model;

public class Base {
    
    public int id;
    public String titulo;
    public String lancamento;
    public String genero;

    @Override
    public String toString() {
        return id + " : " + titulo + ", " + genero + "\nLançamento: " + lancamento;
    }
}
