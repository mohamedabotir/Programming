/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyarrays;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threats
 */
public class CopyArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        long start,end;
        start=System.currentTimeMillis()/1000;
        int []data={1,2,3,4,6,7};
  int []copy;
  int []copy2=new int[data.length];
  int copy3[]=new int [data.length];
  copy=Arrays.copyOf(data, 8);
  copy[7]=5;
  for(int e:copy)
      System.out.println(e);
  
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CopyArrays.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    System.arraycopy(copy, 0, copy2, 0, copy2.length);
    for(int e:copy2)
      System.out.println(e);
    end=System.currentTimeMillis()/1000;
    System.out.println("ElapsedTime:"+(end-start)+"sec");
    }
    
}
