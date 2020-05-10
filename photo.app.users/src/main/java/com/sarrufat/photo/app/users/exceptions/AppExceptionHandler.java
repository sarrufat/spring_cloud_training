package com.sarrufat.photo.app.users.exceptions;

import com.sarrufat.photo.app.users.ui.model.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

        ErrorMessage errorMessages = new ErrorMessage(new Date(), ex.toString());
        return new ResponseEntity<Object>(errorMessages, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {NullPointerException.class, UserServiceExcepction.class})
    public ResponseEntity<Object> handleNullException(Exception ex, WebRequest request) {

        ErrorMessage errorMessages = new ErrorMessage(new Date(), ex.toString());
        return new ResponseEntity<Object>(errorMessages, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*
    @ExceptionHandler(value = {UserServiceExcepction.class})
    public ResponseEntity<Object> handleUSEException(UserServiceExcepction ex, WebRequest request) {

        ErrorMessage errorMessages = new ErrorMessage(new Date(), ex.toString());
        return new ResponseEntity<Object>(errorMessages, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    */

}
