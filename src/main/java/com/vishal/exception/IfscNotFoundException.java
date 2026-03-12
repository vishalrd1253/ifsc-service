package com.vishal.exception;

public class IfscNotFoundException extends RuntimeException {

    public IfscNotFoundException(String message) {
        super(message);
    }
}