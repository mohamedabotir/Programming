/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.Currency;
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
Locale l1=new Locale("AR","Egypt");
Currency c=Currency.getInstance(Locale.ITALY);
System.out.println(l1);
System.out.println(l1.getDisplayLanguage());
   System.out.println(l1.getDisplayCountry());
   System.out.println(l1.getISO3Language());
   System.out.println(c);
    }
    
}
