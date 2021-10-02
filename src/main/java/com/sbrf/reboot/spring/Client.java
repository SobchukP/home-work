package com.sbrf.reboot.spring;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Client {

    private String name;
    private Account2 account;

    public Client(String name, Account2 account){
        this.name = name;
        this.account = account;
    }
}
