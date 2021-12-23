package com.projetogrupo05.projetogrupo05.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controller do tipo REST
@CrossOrigin // aceita requisições de qualquer outro dominio
@RequestMapping("/projetogrupo05")
public class Hello {

    @GetMapping // este método é acesso por um GET
    public String ola() {
        return "Testando...";
    }
    
}
