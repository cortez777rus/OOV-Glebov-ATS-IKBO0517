package com.c0d1red;

import com.c0d1red.ats.Caller;
import com.c0d1red.ats.ATS;

public class Main {

    public static void main(String[] args) {
        testAts();
    }

    private static void testAts() {
        ATS ats = new ATS();

        Caller callerMike = new Caller(ate, "Mike");
        Caller callerVlad = new Caller(ate, "Vlad");
        Caller callerRoman = new Caller(ate, "Roman");

        callerMike.startCall();
        callerVlad.startCall();
        callerRoman.startCall();
    }
}