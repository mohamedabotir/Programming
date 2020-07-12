/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author Threats
 */
import java.lang.*;
public class Stringbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
StringBuffer sb=new StringBuffer("MohamedAbotir");
char[]s=new char[10];
        sb.ensureCapacity(80);
        String ss;
        System.out.println("Value"+sb);
        System.out.println("Length:"+sb.length());
        System.out.println("Capacity:"+sb.capacity());//length+16 (additional)
      sb.getChars(0, 8, s, 0);
      System.out.println(s[7]);
      ss=sb.append("Final").append("Second").toString();
     System.out.println("Append:"+ss);
      sb.insert(7, "Third");
      ss=sb.toString();
      System.out.println("AfterInsert"+ss);
      ss=sb.reverse().toString();
      System.out.println("Reverse"+ss);
     sb.reverse(); 
     sb.delete(7, 12);
     
      System.out.println(sb);
       System.out.println(  "SubString:"+sb.substring(0, 7));

    }
    
}
