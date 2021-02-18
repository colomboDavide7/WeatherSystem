package com.githubcolomboDavide7.MeasureSystem;

public class ConversionException extends Exception {

    public enum ErrorCode{
        ILLEGAL_CONVERSION, UNDEFINED_ERROR_CODE;
    }

    private String msg;
    private ErrorCode errorCode;

    public ConversionException(){
        this.msg = "";
        this.errorCode = ErrorCode.UNDEFINED_ERROR_CODE;
    }

    public ConversionException(String msg){
        this.msg = msg;
        this.errorCode = ErrorCode.UNDEFINED_ERROR_CODE;
    }

    public ConversionException(String msg, ErrorCode code){
        this.msg = msg;
        this.errorCode = code;
    }

    public String getMessage(){
        return this.msg;
    }

}
