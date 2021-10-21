package controller;
import java.util.ArrayList;

public class BaseController<T>{
    
    private ArrayList<T> lista;

    public BaseController(){
        lista = new ArrayList<T>();
    }

    public void create(T obj){
        this.lista.add(obj);
    }

    public ArrayList<T> read(){
        return this.lista;
    }

    public void update(T obj){
        if(find(obj)){
            delete(obj);
            create(obj);
        }
    }

    public void delete(T obj){
        this.lista.remove(obj);
    }

    public boolean find(T obj){
        if(lista.contains(obj)){
            return true;
        }
        return false;
    }

    public void show(ArrayList<T> lista){
        for (T content : lista) {
            System.out.println(content);
        }
    }

}
