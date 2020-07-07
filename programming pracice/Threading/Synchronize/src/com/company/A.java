package com.company;

public class A implements Runnable {
    String name;
    Thread t;
    volatile boolean running=true;

    A(String name)
    {
        t=new Thread(name);
        System.out.println(t);
        t.start();
    }
    @Override
    public void run() {

    }
    void stop()
    {
        running=false;
    }
    synchronized void getType(){

    }
}
