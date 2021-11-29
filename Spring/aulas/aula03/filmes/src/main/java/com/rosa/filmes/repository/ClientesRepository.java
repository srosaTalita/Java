package com.rosa.filmes.repository;

import com.rosa.filmes.model.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
    
}
