package com.rosa.banco;

import com.rosa.banco.model.Filme;
import com.rosa.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{

	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository){
		this.repository = repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filme model = new Filme();
		model.setNome("Lagoa Azul");
		model.setDiretor("Randal Kleiser");
		model.setGenero("romance");

		repository.save(model);
		
		System.out.println("\n");
		repository.findAll().forEach(f -> System.out.printf("%d - %s\n", f.getId(), f.getNome()));
		System.out.println("\n");
	}

}
