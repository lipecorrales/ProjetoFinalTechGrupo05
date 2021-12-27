package com.projetogrupo05.projetogrupo05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClientController {
    
    @Autowired // Pede para implemetar a classe e os métodos de  acesso
    private ClientDto dtoClient;

    @PostMapping("/novo") // Cadastrar novos clientes
    public ResponseEntity<Client> criarClient(@RequestBody Client client) {
        Client clientInserid = dtoClient.novoClient(client);
        return ResponseEntity.ok(clientInserid);
    }
}
