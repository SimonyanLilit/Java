package com.quotesystem.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;
    private  int errorCode;

    public ErrorResponse(String message) {
        this.message = message;
    }
}
