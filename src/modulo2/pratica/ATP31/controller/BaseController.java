package pratica.ATP31.controller;

import java.util.ArrayList;

public class BaseController<T>{
    
    private ArrayList<T> lista;

    public BaseController(){
        this.lista = new ArrayList<T>();
    }

    //create
    public void create(T obj){
        this.lista.add(obj);
    }

    //read
    public ArrayList<T> read(){
        return this.lista;
    }

    //update
    public void update(T obj){
        if(find(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    //delete
    public void delete(T obj){
        if(find(obj)){
            this.lista.remove(obj);
        }
    }

    public boolean find(T obj){
        return this.lista.contains(obj);
    }
}
