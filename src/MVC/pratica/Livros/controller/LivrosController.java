package pratica.Livros.controller;
import java.util.*;
import pratica.Livros.model.Livros;

public class LivrosController {
    
    private ArrayList<Livros> biblioteca = new ArrayList<Livros>();

    public void create(Livros l){
        biblioteca.add(l);
    }

    public ArrayList<Livros> read(){
        return biblioteca;
    }

    public void update(Livros l){
        for (Livros livro : biblioteca) {
            if(l.getId() == livro.getId()){
                delete(l);
                create(l);
            }
        }
    }

    public void delete(Livros l){
        biblioteca.remove(l);
    }
}
