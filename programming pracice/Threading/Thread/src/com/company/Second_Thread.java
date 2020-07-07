package com.company;

public class Second_Thread implements Runnable {
     Thread s;
     String name;
    Second_Thread(String Thread_Name)
    {
        name=Thread_Name;
        s=new Thread(this,name);
        System.out.println(name+" Thread Name:"+s);
    }
    @Override
    public void run() {
        get();
    }
    void get()
    {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name+"Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name+"interrupted.");
        }
        System.out.println("Exiting"+name+"thread.");
    }
    void start()
    {
        s.start();
    }
}
