package pratica.ATP40.dao;

import java.util.ArrayList;

public interface IDao<T>{
    
    public void save(T model);
    public ArrayList<Object> list();
}
