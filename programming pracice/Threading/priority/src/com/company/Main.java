package com.company;

public class Main {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        prior hi = new prior(Thread.NORM_PRIORITY + 2,"mohamed");
        prior lo = new prior(Thread.NORM_PRIORITY - 2,"ahmed");
        lo.start();
        hi.start();
        try {
            Thread.sleep(2500);
            System.out.println("Main Invoked!");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

// Wait for child threads to terminate.
        lo.stop();
        hi.stop();
        try {
            hi.t.join(1000);
            lo.t.join(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}


