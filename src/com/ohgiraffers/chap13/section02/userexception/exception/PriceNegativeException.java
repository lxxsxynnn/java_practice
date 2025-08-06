package com.ohgiraffers.chap13.section02.userexception.exception;

public class PriceNegativeException extends Exception {

    public PriceNegativeException(String message) {
        super(message);
    }
}
