/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Threading
 */
public class gregorianCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar gcln=new GregorianCalendar(2002,7,1,9,65);
        System.out.println(gcln.getTime());
    }
    
}
