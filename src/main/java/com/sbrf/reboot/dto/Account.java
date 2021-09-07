package com.sbrf.reboot.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Account{

    private String accountNumber;
    private long id;
    private LocalDate createDate;
    private BigDecimal balance;

    @Builder
    public Account(long id, LocalDate createDate, BigDecimal balance){
        this.id = id;
        this.createDate = createDate;
        this.balance = balance;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
