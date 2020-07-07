/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Threats
 */
public class Sub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char name[]={'m','o','h','a','m','e','d'};
        String s=new String(name,0,7);//from index 0 to count(7)-->count seven charcter
     char name1[]=new char[10];
        char temp[]=s.toCharArray();//convert string to char array
        System.out.println("String:"+s);
        System.out.println(s.charAt(0));
        
s.getChars(0, 4, name1, 0);
for(char l:name1)
    System.out.print(l);

System.out.println(temp[4]+""+temp[5]+""+temp[6]);//med
        
    }
    
}
