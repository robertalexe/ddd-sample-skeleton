package com.ddd.sample.exceptions;

public class GeneralErrorResponse {

    private int status;
    private String userMessage;
    private String errorCode;

    public GeneralErrorResponse(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
