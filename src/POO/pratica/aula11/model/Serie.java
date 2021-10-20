package model;

public class Serie extends Base{

    public int temporadas;

    @Override
    public String toString() {
        return super.toString() + " | " + temporadas + " temporadas.";
    }
}
