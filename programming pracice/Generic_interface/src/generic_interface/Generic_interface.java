/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_interface;

/**
 *
 * @author Threats
 */
public class Generic_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double data[]={22.2,12.1,21.0,56.5,88.7,124.2};
        double d[]={22.0,33.2,11.3,98.7};
        use <Double>o=new use<>(data);
        o.setSize(new Double(12.2));//Row type and legacy code used if code didn't use generic and you want use it with code use generic
        System.out.println(o.max());
        System.out.println(o.min());

    }
    
}
