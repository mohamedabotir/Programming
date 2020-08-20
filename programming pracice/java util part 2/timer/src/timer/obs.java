/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.Observable;

/**
 *
 * @author Threading
 */
public class obs extends Observable{
    void func(){
    this.setChanged();
    this.notifyObservers(new Integer(200));
    }
}
