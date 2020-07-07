package com.company;

public class Main {
    // Controlling the main Thread.
    public static void main(String[] args) {
Demo_Thread ob1=new Demo_Thread("First");
        Demo_Thread ob2=new Demo_Thread("Second");
        Second_Thread ob3=new Second_Thread("Hi");
        ob3.start();

        try {
            ob3.s.join(600);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
ob1.start();
ob2.start();
try{
    for(int i = 5; i > 0; i--) {
        System.out.println("Main"+ i);
        Thread.sleep(500);
    }

} catch (InterruptedException e) {
    e.printStackTrace();
}
        //System.out.println("Main thread exiting.");
    }
}
