package com.sbrf.reboot.atm.cassettes;

import java.util.ArrayList;

public class Cassette<T> {

    private int countBanknotes = 0;

    public Cassette(ArrayList<T> Banknote) {
        this.countBanknotes += Banknote.size();
    }

    public int getCountBanknotes() {
        return this.countBanknotes;
    }
}
