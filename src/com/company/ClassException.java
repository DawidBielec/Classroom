package com.company;

public class ClassException extends Exception {

    private  String message ;

    public ClassException(String message) {
        this.message = message ;
    }

    public String getMessage() {
        return message ;
    }

}
