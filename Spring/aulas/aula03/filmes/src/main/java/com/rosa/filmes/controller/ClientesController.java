package com.rosa.filmes.controller;

import java.util.List;

import com.rosa.filmes.model.Clientes;
import com.rosa.filmes.repository.ClientesRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientesController {
    
    private ClientesRepository repository;
    
    public ClientesController(ClientesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/clientes")
    public String read(Model req){
        List<Clientes> list = (List<Clientes>)repository.findAll();
        req.addAttribute("clientes", list);
        return "clientes-list";
    }

    @GetMapping("/clientes/cadastro")
    public String create(){
        return "clientes-create";
    }

    @PostMapping("/clientes/salvar")
    public String salvar(Clientes model){
        repository.save(model);
        return "redirect:/clientes";
    }

}
