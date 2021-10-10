package com.sbrf.reboot.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationContextTest {

    @Bean
    public Account2 account2(){
        long accountID = 1L;
        return new Account2(accountID);
    }

    @Bean
    public Client client(){
        String name = "Anonymous";
        return new Client(name, account2());
    }
}
