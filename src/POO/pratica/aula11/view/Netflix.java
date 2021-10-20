package view;

import controller.FilmeController;
import controller.SerieController;
import model.Filme;
import model.Serie;

public class Netflix {

    public static void main(String[] args) {
        
        FilmeController fc = new FilmeController();
        SerieController sc = new SerieController();
    
        System.out.println("--------Criou 2 filmes e uma serie---------");
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

        fc.show(fc.read());

        sc.show(sc.read());

        System.out.println("\n-------Removeu o primerio filme---------");

        fc.delete(filme);

        fc.show(fc.read());

        sc.show(sc.read());

        System.out.println("\n--------Atualizou o segundo filme-------");
        
        Filme filme3 = new Filme();
        filme2.id = 2;
        filme2.titulo = "Harry Potter e a Câmara Secreta";
        filme2.lancamento = "2002";
        filme2.genero = "fantasia e aventura";
        filme2.duracao = "02:41";

        fc.update(filme3);

        fc.show(fc.read());

        sc.show(sc.read());

        System.out.println("----------------------------");

        System.out.println(fc.find(filme2));
    }
    
}
