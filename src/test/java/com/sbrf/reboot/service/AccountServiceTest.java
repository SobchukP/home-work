package com.sbrf.reboot.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static com.sbrf.reboot.service.AccountStatus.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class AccountServiceTest {

    @Mock
    AccountRepository accountRepository;

    @Mock
    Account testAccount;

    AccountService accountService;

    @BeforeEach
    void setUp() {
        accountRepository = Mockito.mock(AccountRepository.class);

        accountService = new AccountService(accountRepository);

        testAccount = Mockito.mock(Account.class);
    }

    @AfterEach
    void clearAccounts(){
        accountService.clearRepository();
    }

    @Test
    void bookExist() {
        Account account = new Account("ACC1234NUM");
        Set<Account> accounts = new HashSet();
        accounts.add(account);

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertTrue(accountService.isAccountExist(1L, account));
    }

    @Test
    void bookNotExist() {
        Set<Account> accounts = new HashSet();
        accounts.add(new Account("ACC1234NUM"));

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertFalse(accountService.isAccountExist(1L, new Account("ACC456NUM")));
    }

    @Test
    void accountsNotEmpty(){
        Set<Account> accounts = new HashSet();
        Account account = new Account("ACC1234NUM");
        accounts.add(account);
        assertFalse(AccountRepository.accounts.equals(new HashSet<>()) && account.getAccountStatus() == ACTIVE);
    }

    @Test
    void getAccountStatus(){

        when(testAccount.getStatus()).thenReturn(LOCKED);

        assertTrue(testAccount.getStatus() == LOCKED);
    }
}