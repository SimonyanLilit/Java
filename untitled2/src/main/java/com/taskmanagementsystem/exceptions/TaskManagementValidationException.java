package com.taskmanagementsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public abstract class TaskManagementValidationException extends RuntimeException {
    public TaskManagementValidationException(String message){
        super(message);
    }
}
