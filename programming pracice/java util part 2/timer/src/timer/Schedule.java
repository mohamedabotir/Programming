/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.TimerTask;

/**
 *
 * @author Threading
 */
public class Schedule  extends TimerTask{

    @Override
    public void run() {
printer();
    }
    void printer(){
    System.out.println("Task Schedule");
    }
    
}
