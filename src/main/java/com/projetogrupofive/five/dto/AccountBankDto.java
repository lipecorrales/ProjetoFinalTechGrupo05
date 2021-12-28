package com.projetogrupofive.five.dto;

import java.util.List;

import com.projetogrupofive.five.model.AccountBank;
import com.projetogrupofive.five.repository.AccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBankDto {
    
    @Autowired
    private AccountRepo repoAccount;

    public List<AccountBank> listAllAccount() {
        List<AccountBank> list = (List<AccountBank>) repoAccount.findAll();
        return list;
    }

    public AccountBank searchAccountPerCode(long accountNumber) {
        AccountBank accountBank = repoAccount.findById(accountNumber).orElse(null);
        return accountBank;
    }
}
