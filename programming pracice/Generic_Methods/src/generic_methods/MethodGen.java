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
public class MethodGen {
    static <T ,V extends T> boolean isIn(T value,V[]Data){//Extends from T not important if you us it for Numbers or Strings
    for(int i=0; i < Data.length; i++)
    {
if(value.equals(Data[i])) 
{return true;}
    }
return false;
    }
    
}
