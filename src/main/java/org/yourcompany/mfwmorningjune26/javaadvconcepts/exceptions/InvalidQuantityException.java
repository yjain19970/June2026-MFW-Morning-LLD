package org.yourcompany.mfwmorningjune26.javaadvconcepts.exceptions;

public class InvalidQuantityException extends Exception {

    public InvalidQuantityException() {
    }

    public InvalidQuantityException(String message) {
        super(message);
    }

    public InvalidQuantityException(Throwable cause) {
        super(cause);
    }

    public InvalidQuantityException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidQuantityException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
