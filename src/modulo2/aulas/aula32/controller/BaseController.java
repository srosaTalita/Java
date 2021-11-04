package aulas.aula32.controller;

import java.util.ArrayList;
import aulas.aula32.dao.BaseDao;

public class BaseController<T>{
    
    private ArrayList<T> list;
    private BaseDao<T> dao;

    public BaseController(String filename){
        this.list = new ArrayList<T>();
        this.dao = new BaseDao<T>(filename);
    }

    public void create(T model){
        this.list.add(model); //salvando em ArrayList
        this.dao.save(model); //salvando em arquivo texto
    }

    public ArrayList<T> read(){
        return this.list;
    }

    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }
    }
    public void delete(T model){
        this.list.remove(model);
    }
}
