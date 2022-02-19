package com.sandwiches.programming.sandwichesMaker.exception;


import lombok.Getter;

@Getter
public class SMakerException extends RuntimeException{
    private SMakerErrorCode sMakerErrorCode;
    private  String detailMessage;

    public SMakerException(SMakerErrorCode sMakerErrorCode){
        super(sMakerErrorCode.getMessage());
        this.sMakerErrorCode = sMakerErrorCode;
        this.detailMessage = sMakerErrorCode.getMessage();
    }

    public SMakerException(SMakerErrorCode sMakerErrorCode, String detailMessage){
        super(detailMessage);
        this.sMakerErrorCode = sMakerErrorCode;
        this.detailMessage = detailMessage;
    }

}
