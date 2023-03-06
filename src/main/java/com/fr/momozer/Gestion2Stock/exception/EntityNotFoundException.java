package com.fr.momozer.Gestion2Stock.exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException{
    @Getter
    private ErrorCodes errorCode;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCode){
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message,  ErrorCodes erroCode){
        super(message);
        this.errorCode = erroCode;
    }

}
