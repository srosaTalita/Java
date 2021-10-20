package controller;

import java.util.ArrayList;

public class BaseController<T>{
    
    private ArrayList<T> lista;

    public BaseController(){ //Construtor
        this.lista = new ArrayList<T>();
    }

    //C
    public void create(T obj){
        this.lista.add(obj);
    }

    //R
    public ArrayList<T> read(){
        return this.lista;
    }

    //U
    public void update(T obj){
        if(find(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    //D
    public void delete(T obj){ // se eu posso declarar o tipo como T e fazer um return?
        this.lista.remove(obj);
    }

    //Verifica se o objeto está contido na lista
    public boolean find(T obj){
        return this.lista.contains(obj);
    }

    public void show(ArrayList<T> lista){
        for (T t : lista) {
            System.out.println(t);
        }
    }
}
