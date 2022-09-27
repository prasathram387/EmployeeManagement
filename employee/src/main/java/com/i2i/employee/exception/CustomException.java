package com.i2i.employee.exception;

import java.lang.Exception;

/**
 * <p>
 * CustomException class can be used for handle exceptions.
 * </p>
 * @author Ramprasath
 * @version 1.0
 **/
public class CustomException extends Exception {

    public CustomException() {
        super();
    }

    public CustomException (String message) {
        super(message);
    }

    public CustomException (String message, Throwable error) {
        super(message, error);
    }
}