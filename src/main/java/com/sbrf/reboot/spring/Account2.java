package com.sbrf.reboot.spring;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Account2 {

    private long accountId;

    public Account2(long accountId){
        this.accountId = accountId;
    }
}
