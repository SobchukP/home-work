package com.sbrf.reboot.utils;

import com.sbrf.reboot.dto.Account;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountUtils {
    public static void sortedById(List<Account> accounts) {
        Comparator<Account> comparator = Comparator.comparing(acc -> acc.getId());
        Collections.sort(accounts, comparator);
    }

    public static void sortedByIdDate(List<Account> accounts) {
        Comparator<Account> comparator = Comparator.comparing(acc -> acc.getId());
        comparator = comparator.thenComparing(acc -> acc.getCreateDate());
        Collections.sort(accounts, comparator);
    }

    public static void sortedByIdDateBalance(List<Account> accounts) {
        Comparator<Account> comparator = Comparator.comparing(acc -> acc.getId());
        comparator = comparator.thenComparing(acc -> acc.getCreateDate());
        comparator = comparator.thenComparing(acc -> acc.getBalance());
        Collections.sort(accounts, comparator);
    }
}
