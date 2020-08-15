/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.SimpleTimeZone;
import java.util.Locale;
/**
 *
 * @author Threading
 */
public class local{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Locale l=new Locale("AR","Egypt");

System.out.println(l);
System.out.println(l.getDisplayLanguage());
   System.out.println(l.getDisplayCountry());
   System.out.println(l.getISO3Language());
    }
    
}
