package com.sbrf.reboot.dto;

import lombok.Data;

@Data
public class Request {

    private String atmNumber;

    public Request(String atmNumber){
        this.atmNumber = atmNumber;
    }

    public Request() {}

}
