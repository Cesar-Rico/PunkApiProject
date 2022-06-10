package com.punk.punkApiProject.beer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnexpectedBehaviorException extends RuntimeException{

    public ApiUnexpectedBehaviorException() { super(); }

    public ApiUnexpectedBehaviorException(String message) { super(message); }
}
