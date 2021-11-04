package aulas.aula32.dao;

import java.io.*;
import java.util.*;

import aulas.aula32.model.Pessoa;

public class PessoaDao extends BaseDao<Pessoa>{
    
    public PessoaDao(){
        super("dados/pesoa.csv");
    }

    public void list(){
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
