package com.ddd.sample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public GeneralErrorResponse handleException(HttpServletRequest request, Exception exception) {
        String messageKey = "error.general.server.error";
        GeneralErrorResponse errorResponse = new GeneralErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.setErrorCode(messageKey);
        errorResponse.setUserMessage(messageKey);
        return errorResponse;
    }
}
