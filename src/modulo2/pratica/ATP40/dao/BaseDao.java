package pratica.ATP40.dao;

import java.io.*;

public class BaseDao<T extends Base> implements IDao<T>{
    
    protected String filename;

    public BaseDao(String filename){
        this.filename = filename;
    }

    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString() + "\n");
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
