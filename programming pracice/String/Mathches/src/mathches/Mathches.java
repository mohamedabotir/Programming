/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathches;

/**
 *
 * @author Threats
 */
public class Mathches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="MohamedAbotir";
                String s2="MohamedKampo";
                String s3="123";
                String s4="12";
                System.out.println(s1.regionMatches(0, s2, 0, 8));//compare from string to specific region in  string 
System.out.println(s1.startsWith("Mohamed")?"true":"false");
System.out.println(s1.endsWith("tir")?"true":"false");
System.out.println(s3.compareTo(s4)<0);
    }
    
}
