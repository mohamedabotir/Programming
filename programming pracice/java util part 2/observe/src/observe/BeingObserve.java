/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observe;

import java.util.Observable;

/**
 *
 * @author Threading
 */
public class BeingObserve extends Observable{
    void func(){
        setChanged();
        notifyObservers(new Integer(12)); 
    }
}
