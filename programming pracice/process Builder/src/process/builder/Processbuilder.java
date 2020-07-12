/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process.builder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threats
 */
public class Processbuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start,end;
        start=System.currentTimeMillis();
ProcessBuilder s=new ProcessBuilder("notepad","D:\\Programming\\programming pracice\\process Builder\\file.java.txt");
        try {
            s.start();
           System.out.println( s.directory());
        } catch (IOException ex) {
            Logger.getLogger(Processbuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        end=System.currentTimeMillis();
        System.out.println("ElapsedTime:"+(end-start));
    }
    
}
