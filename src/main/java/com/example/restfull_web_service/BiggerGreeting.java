package com.example.restfull_web_service;


public class BiggerGreeting {
    private final long id;
    private final String message;
    private int a;
    protected int b;
    public int c;
    public static int d;

    public BiggerGreeting(long id, String message) {
        this.id = id;
        this.message = message;
        a = 4;
        b = 5;
        c = 6;
        d = 7;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static int getD() {
        return d;
    }
}
