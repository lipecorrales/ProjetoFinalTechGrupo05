package com.projetogrupo05.projetogrupo05.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBancariaDto {
    
    @Autowired
    private AccountRepo repoAccount;

    public List<AccountBancaria> listarTodasAccount() {
        List<AccountBancaria> lista = (Lista<AccountBancaria>) repoAccount.findAll();
        return lista;
    }

    public AccountBancaria buscarAccountPorCodigo(long AccountNumero) {
        AccountBancaria accountBancaria = repoAccount.findById(accountNumero).orElse(null);
        return accountBancaria;
    }
}
