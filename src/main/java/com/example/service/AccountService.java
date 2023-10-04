package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import com.example.resource.RequestAmount;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    public List<Account> findAll(){
    	return this.accountRepository.findAll();
    }
    
    public Account create(RequestAmount requestAmount) {
    	Account account = new Account();
    	account.setAmount(requestAmount.getAmount());
    	return this.accountRepository.save(account);
    }
}