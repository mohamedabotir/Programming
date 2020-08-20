/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observe;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Threading
 */
public class observe1 implements Observer{

    @Override
    public void update(Observable o, Object o1) {
System.out.println("Observe One With Value:"+((Integer)o1).intValue());
    }
    
}
