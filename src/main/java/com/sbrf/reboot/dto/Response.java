package com.sbrf.reboot.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {

    private String statusCode;
    public Response(String statusCode){
        this.statusCode = statusCode;
    }

}
