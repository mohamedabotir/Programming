package com.company;

public class Callme  {

        void call(String msg) {
            System.out.print("[" + msg);
            try {
for (int i=5;i>0;i--) {
    System.out.print("[" + msg);
    Thread.sleep(1000);
}
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("]");
        }

}
