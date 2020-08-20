/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threading
 */
public class timer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        obser o=new obser();
        obs oo=new obs();
        oo.addObserver(o);
        Schedule obj=new Schedule();
       Timer t=new Timer();
       t.schedule(obj,1000,500);
       try{
       Thread.sleep(5000);
       } catch (InterruptedException ex) {
            Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
        }
       t.cancel();
    }
    
}
