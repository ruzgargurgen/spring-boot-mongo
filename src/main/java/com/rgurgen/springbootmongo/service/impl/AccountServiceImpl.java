package com.rgurgen.springbootmongo.service.impl;

import com.rgurgen.springbootmongo.entity.Account;
import com.rgurgen.springbootmongo.repository.AccountRepository;
import com.rgurgen.springbootmongo.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account save(Account account) {
        account.setCreatedAt(new Date());
        account.setActive(true);
        return accountRepository.save(account);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account update(String id, Account account) {
        Account accountEntity=accountRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Account id not found!"));
        accountEntity.setName(account.getName());
        accountEntity.setSurname(account.getSurname());
        accountEntity.setUsername(account.getUsername());
        accountEntity.setEmail(account.getEmail());
        accountEntity.setPassword(account.getPassword());
        accountEntity.setBirthDate(account.getBirthDate());
        return accountRepository.save(accountEntity);
    }

    @Override
    public void delete(String id) {
        accountRepository.deleteById(id);
    }
}
