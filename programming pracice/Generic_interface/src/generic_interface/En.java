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
public interface En <T extends Comparable<T> >{
    T min();
    T max();
    
}
