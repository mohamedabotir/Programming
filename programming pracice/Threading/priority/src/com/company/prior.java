package com.company;

public class prior implements Runnable {
    // Demonstrate thread priorities.
String name;
        long click = 0;
        Thread t;
        private volatile boolean running = true;
        public prior(int p,String name) {
            t = new Thread(this);
            t.setPriority(p);
       this.name=name;
        }
        public void run() {
            System.out.println("Kampo");
            while (running) {
                click++;
            }
            int i=5;
            while(i>0)
            {
                System.out.println(name+"Number:"+i);
                i--;
            }
        }
        public void stop() {
            running = false;
        }
        public void start() {
            t.start();
        }
    }

