package com.Eccezioni.Es_1;

public class EmptyArrException extends Exception {
    public static final long serialVersionUID = 1L; //che è?

    public EmptyArrException() {
        super();
    }

    public EmptyArrException(String message) {
        super(message);
    }

    public EmptyArrException(Exception e) {
        super(e);
    }

    public void printStackTrace(String d){
        new EmptyArrException(d);
    }

}
