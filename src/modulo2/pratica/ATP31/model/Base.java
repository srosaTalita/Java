package pratica.ATP31.model;

public abstract class Base{
    
    public int id;

    @Override
    public String toString() {
        return id + " - ";
    }

    @Override
    public boolean equals(Object obj) {
        Base b = (Base)obj;
        if(this.id == b.id){
            return true;
        }
        return false;
    }
}
