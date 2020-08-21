/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package format;

import java.util.Calendar;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author Threading
 */
public class Format {

    //----------Better Using printf as it get object from formatter 
    public static void main(String[] args) {
        Currency c=Currency.getInstance(Locale.US);
        Formatter fmt;
        Calendar  cnd=Calendar.getInstance();
       fmt=new Formatter();
        fmt.format("%tr", cnd);
       System.out.println(fmt);
       fmt=new Formatter();
       
       fmt.format("%tc", cnd);
       System.out.println(fmt);
        fmt=new Formatter();
        fmt.format("%tl:%tm", cnd,cnd);
    System.out.println(fmt);
    fmt=new Formatter();
    fmt.format("%,.2f"+c.getSymbol()+"", 1232451.2,"");
    
    System.out.println(fmt);
    fmt=new Formatter();
    fmt.format("%.3f", 12225.3645);
    System.out.println(fmt);
     fmt=new Formatter();
    fmt.format("%.3e", 12225.3645);//number before dot is for number of right space
    System.out.println(fmt);
    //justification 0 space + ,left jusfification -d for number or -s for String or -.3f for double 
    // + for positive
    fmt=new Formatter();
    fmt.format("%+.3e",12225.3645);
    System.out.println(fmt);
    // + for negative
    fmt=new Formatter();
    fmt.format("%d", -12556);
    System.out.println(fmt);
    //Octal decicmal Binary
    fmt=new Formatter();
    fmt.format("%o", -12556);
    System.out.println(fmt);
     fmt=new Formatter();
    fmt.format("%x", -12556);
    System.out.println(fmt);
    fmt=new Formatter();
    fmt.format("%x", -12556);
    System.out.println(fmt);
     //Upper Case
    fmt=new Formatter();
    fmt.format("%E", 121.312);
    System.out.println(fmt);
    //Uppercases the corresponding string
     fmt=new Formatter();
    fmt.format("%S", "mohamed");
    System.out.println(fmt);
    //Argument Index
    fmt=new Formatter();
    fmt.format("%3$-4d %2$4d %1$4d", 20,1,30);
    System.out.println(fmt);
    }
    
}
