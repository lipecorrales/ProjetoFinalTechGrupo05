package com.projetogrupofive.five.controller;

import java.util.List;

import com.projetogrupofive.five.dto.AccountBankDto;
import com.projetogrupofive.five.model.AccountBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class AccountController {
    
    @Autowired // Pede para implementar a classe e os métodos de acesso
    private AccountBankDto dtoAccountBank;

    @GetMapping("/contas") // Mostrar todas as contas
    public List<AccountBank> getAllAccount() {
        return dtoAccountBank.listAllAccount();
    }

    @GetMapping("/{numero}") // encontrar conta de acordo com {numero}
    public ResponseEntity<AccountBank> getByNumero(@PathVariable long numero) {
        AccountBank accountFound = dtoAccountBank.searchAccountPerCode(numero);

        if(accountFound !=null) {
            return ResponseEntity.ok(accountFound);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
