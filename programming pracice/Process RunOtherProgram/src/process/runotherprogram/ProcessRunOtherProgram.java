/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process.runotherprogram;

import java.util.Arrays;

/**
 *
 * @author Threats
 */
public class ProcessRunOtherProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
          Runtime rt=Runtime.getRuntime();
Process p=null;
long start,end;
        start=System.currentTimeMillis()/1000;
try{
p=rt.exec("notepad");
System.out.println(p.waitFor());
}catch(Exception E){

}

end=System.currentTimeMillis()/1000;
System.out.println("ElapsedTime:"+(end-start)+"sec");

    }
    
}
