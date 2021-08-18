package com.sbrf.reboot.service;

import java.util.HashSet;
import java.util.Set;

public interface AccountRepository {

    Set<Account> accounts = new HashSet<>();

    Set<Account> getAllAccountsByClientId(long accountId);

    static void accountToRepository(Account account){
        accounts.add(account);
    }

}
