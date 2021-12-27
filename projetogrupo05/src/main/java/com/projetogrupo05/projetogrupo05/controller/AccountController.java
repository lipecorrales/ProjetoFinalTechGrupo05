package com.projetogrupo05.projetogrupo05.controller;

import java.util.List;

import com.projetogrupo05.projetogrupo05.dto.AccountBancariaDto;
import com.projetogrupo05.projetogrupo05.model.AccountBancaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
@CrossOrigin("*")
public class AccountController {
    
    @Autowired
    private AccountBancariaDto dtoAccountBancaria;

    @GetMapping("/contas") // Mostrar todas as contas
    public List<AccountBancaria> obterTodasAccounts() {
        return dtoAccountBancaria.listarTodasAccounts();
    }

    @GetMapping("/{numero}") // Encontrar conta de acordo com {numero}
    public ResponseEntity<AccountBancaria> getByNumero(@PathVariable long numero){
        AccountBancaria accountEncontrada = dtoAccountBancaria.buscarAccountPorCodigo(numero);
        if (accountEncontrada != null) {
            return ResponseEntity.ok(accountEncontrada);    
    } else {
        return ResponseEntity.notFound().build();
        }
    }
}