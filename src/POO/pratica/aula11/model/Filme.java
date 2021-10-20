package model;

public class Filme extends Base{
    
    public String duracao;

    @Override
    public String toString() {
        return super.toString() + " | " + duracao + "h.";
    }
}
