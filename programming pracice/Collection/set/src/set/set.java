/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Threading
 */
public class set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Set<Integer>l1 = new HashSet<Integer>();
       SortedSet<Integer>l2=new TreeSet<Integer>(l1);
       l1.add(0);
       l1.add(12);
       l1.add(120);
       
       l1.add(2);
       l1.add(-3);
       l1.add(-7);
       l1.add(-8);
       l1.add(-5);
       l1.add(-6);
       l1.add(7);
       l2.addAll(l1);
       System.out.println((l1));
       System.out.println(l2);
    }
    
}
