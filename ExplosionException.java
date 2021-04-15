package com.c0d1red.ats;

public class ExplosionException extends RuntimeException {
    public ExplosionException() {
        super("ATS has been exploded!");
    }
}