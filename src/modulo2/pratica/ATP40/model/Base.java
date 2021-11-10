package pratica.ATP40.model;

public abstract class Base{
    
    public int id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base outro = (Base)obj;
            if(outro.id == this.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String idRetorno = Integer.toString(id);
        return idRetorno;
    }
}
