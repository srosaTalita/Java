package com.rosa.banco.repository;

import com.rosa.banco.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
