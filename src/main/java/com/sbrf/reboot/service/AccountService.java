package com.sbrf.reboot.service;

import lombok.Data;

import static com.sbrf.reboot.service.AccountStatus.*;

//@Data
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isAccountExist(long accountId, Account account) {
        return accountRepository.getAllAccountsByClientId(accountId).contains(account);
    }

    public void clearRepository(){
        for (Account account : AccountRepository.accounts) {
            account.setStatus(DISABLED);
        }
        AccountRepository.accounts.clear();
    }
}
