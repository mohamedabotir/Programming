/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedscanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Threading
 */
public class AdvancedScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        FileWriter fw=new FileWriter("data.txt");
        fw.write("Name:MohamedKampo,ID:12");
        fw.close();
        FileReader fr=new FileReader("data.txt");
        Scanner input=new Scanner(fr);
        input.findInLine("Name:");
        StringTokenizer stn=new StringTokenizer(input.nextLine());
        System.out.println(stn.nextToken(","));
        fr.close();
        input.close();
    }
    
}
