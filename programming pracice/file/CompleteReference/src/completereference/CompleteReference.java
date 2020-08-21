/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completereference;

import java.io.File;
import java.text.DecimalFormat;

/**
 *
 * @author Threading
 */
public class CompleteReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.###");
        File store=new File("Game.bat");
       System.out.println(store.canRead());
       System.out.println(store.canWrite());        
       System.out.printf("%.2f%2$s",(store.getFreeSpace()/(1024.0*1024.0*1024)),"gb");
       System.out.println("\n"+df.format(store.getUsableSpace()/(1024.0*1024.0*1024))+"gb");
       System.out.println(store.getTotalSpace()/(1024*1024*1024)+"gb");
    }
    
}
