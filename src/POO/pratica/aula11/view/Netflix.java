package view;


import controller.FilmeController;
import controller.SerieController;
import model.Filme;
import model.Serie;

public class Netflix {

    public static void main(String[] args) {
        
        FilmeController fc = new FilmeController();
        SerieController sc = new SerieController();
    
        Filme filme = new Filme();
        filme.id = 1;
        filme.titulo = "HP - PF";
        filme.lancamento = "2001";
        filme.genero = "fantasia";
        filme.duracao = "02:30";

        Filme filme2 = new Filme();
        filme2.id = 2;
        filme2.titulo = "HP - CS";
        filme2.lancamento = "2002";
        filme2.genero = "fantasia";
        filme2.duracao = "02:40";
    
        Serie serie = new Serie();
        serie.id = 1;
        serie.titulo = "The Office";
        serie.lancamento = "2005";
        serie.genero = "Comedia";
        serie.temporadas = 9;

        fc.create(filme);
        fc.create(filme2);
        sc.create(serie);

        for (Filme f : fc.read()) {
            System.out.println(f);
        }

        for (Serie s : sc.read()) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        fc.delete(filme);

        for (Filme f : fc.read()) {
            System.out.println(f);
        }

        System.out.println("----------------------------");
        
        Filme filme3 = new Filme();
        filme2.id = 2;
        filme2.titulo = "HP - PA";
        filme2.lancamento = "2002";
        filme2.genero = "fantasia";
        filme2.duracao = "02:40";

        fc.update(filme3);

        for (Filme f : fc.read()) {
            System.out.println(f);
        }

        System.out.println("----------------------------");
    }
    
}
