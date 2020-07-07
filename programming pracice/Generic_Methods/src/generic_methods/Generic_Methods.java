/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_methods;

/**
 *
 * @author Threats
 */
import static generic_methods.MethodGen.isIn;
public class Generic_Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer []Sum={1,3,2,6,3,11};
        String []s={"Mohamed","Karim","BamBow"};
        if(isIn(11,Sum))
            System.out.println("This Is from Sum");
        else{
        System.out.println("Isn't from Sum");
        }
        if(isIn("Mohamed",s))
            System.out.println("match");
        else 
            System.out.println("Error No match");
    }
    
}
