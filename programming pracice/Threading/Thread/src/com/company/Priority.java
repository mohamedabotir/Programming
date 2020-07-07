package com.company;

public class Priority {
    // Demonstrate thread priorities.
    class clicker implements Runnable {
        long click = 0;
        Thread t;
        private volatile boolean running = true;
        public clicker(int p) {
            t = new Thread(this);
            t.setPriority(p);
        }
        public void run() {
            while (running) {
                click++;
            }
        }
        public void stop() {
            running = false;
        }
        public void start() {
            t.start();
        }
    }
}
