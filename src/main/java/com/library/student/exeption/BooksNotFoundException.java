package com.library.student.exeption;

public class BooksNotFoundException extends RuntimeException {
    public BooksNotFoundException() {
    }

    public BooksNotFoundException(String message) {
        super(message);
    }

    public BooksNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BooksNotFoundException(Throwable cause) {
        super(cause);
    }

    public BooksNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
