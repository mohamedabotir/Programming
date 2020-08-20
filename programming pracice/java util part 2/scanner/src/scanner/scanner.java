/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Threading
 */
public class scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       int count=0;
       double sum=0.0;
       double i=3.0;
       FileWriter ft=new FileWriter("data.txt",true);
       ft.write("2 3.5 5 42 66.6");
       
       FileReader fr=new FileReader("data.txt");
       Scanner sc=new Scanner(fr);
        while(i>0){
               
           ft.write(" 1 22.5 33.1 25");
           i--;
           
           
           }
        ft.write("\ndone\n");
        ft.close();
       while(sc.hasNext()){
          
       if(sc.hasNextDouble())
       {
           
       sum+=sc.nextDouble();
       count++;
       }else{
       String str=sc.next();
       if(str.equals("done"))
       break;
       else {
System.out.println("File format error.");
return;
}
       }
       
       }
       sc.close();
       
       System.out.println("Average is " + sum / count);
    }
    
}
