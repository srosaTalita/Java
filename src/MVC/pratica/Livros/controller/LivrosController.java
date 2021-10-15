package pratica.Livros.controller;
import java.util.*;
import pratica.Livros.model.Livros;

public class LivrosController {
    
    private ArrayList<Livros> biblioteca = new ArrayList<Livros>();

    public void create(Livros l){
        biblioteca.add(l);
    }

    public ArrayList<Livros> read(){
        System.out.println("\nLivros: ");
        for (Livros livros : biblioteca) {
            System.out.println("\t" + livros);
        }
        return biblioteca;
    }

    public void update(Livros l){
        int id = l.getId();
        for (Livros livro : biblioteca) {
            if(livro.getId() == id){
                delete(id);
                create(l);
            }
        }
    }

    public void delete(int id){
        for (Livros livro : biblioteca) {
            if(livro.getId() == id){
                biblioteca.remove(livro);
            }
        }
    }
}
