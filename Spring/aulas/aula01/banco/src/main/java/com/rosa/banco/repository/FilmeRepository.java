package com.rosa.banco.repository;

import com.rosa.banco.model.Filme;
import org.springframework.data.repository.CrudRepository;

//CrudRepository - classe do Spring que define os métodos Crud<Model, tipo de Id>
public interface FilmeRepository extends CrudRepository<Filme,Integer>{
    
}
