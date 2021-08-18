package com.sbrf.reboot.service;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

import static com.sbrf.reboot.service.AccountStatus.*;

@Data
public class Account implements AccountRepository {

    private String accountId;
    private AccountStatus status = ACTIVE;

    public Account(String id) {
        this.accountId = id;
        AccountRepository.accountToRepository(this);
    }

    public void setStatus(AccountStatus status){
        this.status = status;
    }

    public AccountStatus getAccountStatus(){
        return this.status;
    }

    @Override
    public Set<Account> getAllAccountsByClientId(long clientId) {
        Set<Account> accountsByClientId = new HashSet();
        for (Account account : accounts){
            if (account.getAccountId() == accountId) {
                accountsByClientId.add(account);
            }
        }
        return accountsByClientId;
    }
}
