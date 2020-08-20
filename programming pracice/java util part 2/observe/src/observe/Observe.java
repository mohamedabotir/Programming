/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observe;

/**
 *
 * @author Threading
 */
public class Observe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        observe1 o1=new observe1(); 
        observe2 o2=new observe2(); 
        BeingObserve ob3=new BeingObserve();
        ob3.addObserver(o2);
        ob3.addObserver(o1);
        ob3.func();
        System.out.println('\7');
    }
    
}
