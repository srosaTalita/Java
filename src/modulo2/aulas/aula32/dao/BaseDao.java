package aulas.aula32.dao;

import java.io.*;
import java.util.*;


public class BaseDao<T>{

    protected String filename;
    
    public BaseDao(String filename){
        this.filename = filename;
    }

    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }

    public void update(){

    }

    public void remove(){

    }

}
