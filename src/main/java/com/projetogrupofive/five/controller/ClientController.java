package com.projetogrupofive.five.controller;

import com.projetogrupofive.five.dto.ClientDto;
import com.projetogrupofive.five.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conta")
@CrossOrigin("*")
public class ClientController {
    
    @Autowired // Pede para implementar a classe e os métodos de acesso
    private ClientDto dtoClient;

    @PostMapping("/novo") // Cadastrar novos clientes
    public ResponseEntity<Client> newClient(@RequestBody Client client) {
        Client clientInserid = dtoClient.newClient(client);
        return ResponseEntity.ok(clientInserid);
    }
}
