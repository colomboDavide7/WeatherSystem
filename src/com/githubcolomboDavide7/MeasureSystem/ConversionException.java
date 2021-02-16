package com.githubcolomboDavide7.MeasureSystem;

public class ConversionException extends Exception {

    private String message;

    public ConversionException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}
