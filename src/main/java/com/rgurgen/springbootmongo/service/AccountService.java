package com.rgurgen.springbootmongo.service;

import com.rgurgen.springbootmongo.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);

    List<Account> findAll();

    Account update(String id, Account account);

    void delete(String id);
}
