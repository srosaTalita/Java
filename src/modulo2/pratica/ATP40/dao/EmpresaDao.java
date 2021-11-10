package pratica.ATP40.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import pratica.ATP40.model.Empresa;

public class EmpresaDao extends BaseDao<Empresa>{
    
    public EmpresaDao(){
        super("ATP40/dados/empresa.csv");
    }

    public ArrayList<Object> list(){  
        ArrayList<Object> pessoas = new ArrayList<Object>();      
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine(); 
                Empresa empresa = new Empresa(linha);
                pessoas.add(empresa);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        return pessoas; 
    }
}
