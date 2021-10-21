package model;

public abstract class Base {
    
    public int id;

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
