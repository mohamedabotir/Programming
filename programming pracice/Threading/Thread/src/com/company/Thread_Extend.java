package com.company;

public class Thread_Extend extends Thread {
    Thread_Extend()
    {
        super("Third");
        System.out.println("Third Thread:"+this);

    }
    // This is the entry point for the second thread.
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Third Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Third interrupted.");
        }
        System.out.println("Exiting Third thread.");
    }
    void starts()
    {
        start();
    }
}
