package com.httpio.app;

public class Log {
    private final String id;
    private final String message;

    public Log(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args ) {
        System.out.println( "Hello World!" );
    }
}