/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calender;

import java.util.Calendar;

/**
 *
 * @author Threading
 */
public class calender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cln=Calendar.getInstance();
        cln.set(Calendar.MONTH,8);
        System.out.println(cln.get(Calendar.MONTH));
    }
    
}
