package com.example;

class InvalidProductException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidProductException(String s) {
        super(s);
    }
}
