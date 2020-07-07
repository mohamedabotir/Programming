package com.company;

public class Sync implements Runnable{
    String Msg,Msg2;
    Thread t,t2;
    B target;
    A o;
    private volatile boolean isRunning=true;
    private volatile boolean running=true;
    Sync(String Msg,String Msg2,A o,B target)
    {
        t=new Thread(this);
        t2=new Thread(this);
        this.Msg=Msg;
        this.Msg2=Msg2;
        this.o=o;
        this.target=target;
        System.out.println(t);
        System.out.println(t2);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target)
        {


            target.print(Msg2);
        }
        synchronized (o){
            o.operation(Msg);
        }
    }
void stop()
{
    isRunning=false;
}
}
