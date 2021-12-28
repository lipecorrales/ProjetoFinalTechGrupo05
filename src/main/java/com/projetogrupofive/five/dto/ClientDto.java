package com.projetogrupofive.five.dto;

import com.projetogrupofive.five.model.Client;
import com.projetogrupofive.five.repository.ClientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDto {
    
    @Autowired
    private ClientRepo repoClient;

    public Client newClient(Client ClientNew) {
        Client clientInserid = repoClient.save(ClientNew);
        return clientInserid;
    }
}
