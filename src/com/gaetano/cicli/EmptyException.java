package com.gaetano.cicli;

public class EmptyException extends Exception {
    public static final long serialVersionUID= 1L;

    public EmptyException(){
        super();
    }
    public EmptyException(String str){
        super(str);
    }
    public EmptyException (Exception e){
        super(e);
    }

}
