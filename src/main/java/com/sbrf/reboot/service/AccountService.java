package com.sbrf.reboot.service;

import lombok.Data;


@Data
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isAccountExist(long accountId, Account account) {
        return accountRepository.getAllAccountsByClientId(accountId).contains(account);
    }
}
