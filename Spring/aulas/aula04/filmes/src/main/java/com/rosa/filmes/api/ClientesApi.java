package com.rosa.filmes.api;

import java.util.List;
import com.rosa.filmes.model.Clientes;
import com.rosa.filmes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesApi {

    @Autowired //substitui o construtor, na injeção de dependências
    private ClientesRepository repository;
    
    @GetMapping("/api/clientes")
    public List<Clientes> read(Model req){
        List<Clientes> list = (List<Clientes>)repository.findAll();
        req.addAttribute("clientes", list);
        return list;
    }

    @PostMapping("/api/clientes/salvar")
    public String salvar(@RequestBody Clientes model){
        repository.save(model);
        return "Salvo com sucesso";
    }

    @DeleteMapping("/api/clientes/deletar/{id}")
    public String delete(@PathVariable int id){
        repository.deleteById(id);
        return "Deletado com sucesso!";
    }

    @PutMapping("/api/clientes/editar/{id}")
    public String update(@PathVariable int id, @RequestBody Clientes model){
        if(model.getId() == id){
            repository.save(model);
            return "Atualizado com sucesso";
        }
        return "Ids diferentes";
    }

}
