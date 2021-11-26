package com.rosa.banco;

import com.rosa.banco.model.Cliente;
import com.rosa.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{

	private ClienteRepository repository;

	public BancoApplication(ClienteRepository repository){
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Create
		Cliente model = new Cliente();
		model.setNome("Talita");
		model.setSobrenome("Rosa");
		repository.save(model);

		Cliente model2 = new Cliente();
		model2.setNome("Natália");
		model2.setSobrenome("Rosa");
		repository.save(model2);

		//Read
		repository.findAll().forEach(cliente -> System.out.printf("%d - %s %s\n", cliente.getId(), cliente.getNome(), cliente.getSobrenome()));

		//update
		Cliente model3 = new Cliente();
		model3.setId(2);
		model3.setNome("Luci");
		model3.setSobrenome("Rosa");
		repository.save(model3);

		//Read
		repository.findAll().forEach(cliente -> System.out.printf("%d - %s %s\n", cliente.getId(), cliente.getNome(), cliente.getSobrenome()));

		//Delete
		repository.deleteById(2);

		//Read
		repository.findAll().forEach(cliente -> System.out.printf("%d - %s %s\n", cliente.getId(), cliente.getNome(), cliente.getSobrenome()));
	}

}
