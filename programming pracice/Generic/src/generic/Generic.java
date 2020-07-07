/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;
import static generic.Entry.showXYZ;

/**
 *
 * @author Threats
 */
public class Generic {

    
    public static void main(String[] args) {
       Pointss s []={new Pointss(12,15,7),new Pointss(40,13,2),new Pointss(16,11,3),new Pointss(52,75,1)};
       Entry <Pointss> ss=new Entry<>(s);
       showXYZ(ss);
     
    }
    
}
