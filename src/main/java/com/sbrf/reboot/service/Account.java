package com.sbrf.reboot.service;

import lombok.Data;

@Data
public class Account{

    private String accountNumber;

    public Account(String id) {
        this.accountNumber = id;

    }

}
