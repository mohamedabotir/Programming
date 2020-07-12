/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

/**
 *
 * @author Threats
 */
public class RunTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Runtime r = Runtime.getRuntime();
long l1,l2;
Integer []values=new Integer[1000];
System.out.println("TotalMenmory:"+r.totalMemory()/1024+"MB");
l1=r.freeMemory();
System.out.println("FreeMemory:"+l1+"Bytes");
r.gc();
l1=r.freeMemory();
System.out.println("FreeMemory After grapageCollector:"+l1+"Bytes");
for(int i=0;i<values.length;i++)
    values[i]=i;
l2=r.freeMemory();
System.out.println("(AfterFillIntegerData)FreeMemory:"+l2+"Bytes");
System.out.println("Used Memory By Allocation:"+(l1-l2));
// discard Integers
for(int i=0; i<1000; i++) values[i] = null;
r.gc(); // request garbage collection
l2 = r.freeMemory();
System.out.println("Free memory after collecting" +
" discarded Integers: " + l2);
    }
    
}
