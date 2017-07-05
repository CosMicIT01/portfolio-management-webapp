package de.cosmicit.pms.controller.exception;

public class LogicalException extends Exception{
    public LogicalException(String errorMessage) {
        super(errorMessage);
    }

    public LogicalException(String errorMessage, Throwable ex) {
        super(errorMessage, ex);
    }
}
