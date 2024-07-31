package com.example.cuentas.domain.common.exception;

public class NoExistClientException extends RuntimeException{
    public NoExistClientException(String message) {
        super(message);
    }
}
