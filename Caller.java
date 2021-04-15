package com.c0d1red.ats;

public class Caller {
    private final Thread callThread;

    public Caller(ATS ats, String callerName) {
        Thread thread = new CallThread(ate);
        thread.setName(callerName);
        this.callThread = thread;
    }

    public void startCall() {
        callThread.start();
    }

    private static class CallThread extends Thread {
        private final ATS ats;

        public CallThread(ATS ats) {
            this.ats = ats;
        }

        @Override
        public void run() {
            ats.doCall();
        }
    }
}