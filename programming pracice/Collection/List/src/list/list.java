/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.*;

/**
 *
 * @author Threading
 */
public class list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Integer>l1=new ArrayList<Integer>();
       List<Integer>l2=new ArrayList<Integer>();
       Object copy[];
       l2.add(112);
       l2.add(1122);
       l2.add(1112);
       l2.add(1132);
       l1.add(12);
       l1.add(122);
       l1.add(112);
       l1.add(132);
       copy=l1.toArray();//copy all data of l1 to copy array
       System.out.println( "Size:"+l1.size());
       l1.addAll(1,l2);//add element of list2  to list1
       System.out.println( "Size:"+l1.size());//Size will increase by 4 nmber of element of l2 
     System.out.println( l1.get(0));
     System.out.println(l1.get(5));
     System.out.println(l1.retainAll(l2));//delete all element from list 1 except element of l2
     System.out.println( "Size:"+l1.size());// size will decrease by 4 number of element of l1
     System.out.println( l1.get(0));
     System.out.println(l1.removeAll(l2));//remove element of l2 
     System.out.println( "Size:"+l1.size());// will decrese by 4 =0
     for(Object s:copy)
         System.out.print(s+",");
     System.out.println();
    }
    
}
