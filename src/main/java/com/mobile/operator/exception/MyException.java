package com.mobile.operator.exception;

public class MyException extends Exception {


    public MyException(String message) {
        super(message);
        System.out.println(message);
    }

}
