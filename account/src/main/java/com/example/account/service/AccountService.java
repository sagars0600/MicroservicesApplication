package com.example.account.service;

import com.example.account.model.Account;
import com.example.account.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

    public List<Account> getAccounts(){
        return accountRepo.findAll();
    }

}
