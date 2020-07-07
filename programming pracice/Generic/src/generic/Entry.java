/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Threats
 * @param <T>
 */
public class Entry <T extends Pointss>{
    T Data[];
    Entry(T Data[])
    {
        this.Data=Data;
    }
    static void showXYZ(Entry   <?> c) {
System.out.println("X Y Z Coordinates:");
for(int i=0; i < c.Data.length; i++)
System.out.println(c.Data[i].x + " " +
c.Data[i].y + " " +
c.Data[i].z);
System.out.println();
}
    
}
