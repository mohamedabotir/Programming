package com.company;

public class A {
    int number1;
    int number2;
    int result;
    void display(){
    try{
        number1=12;
        number2=5;
        result=number1/number2;
        try{
if (number1==12)
{
    throw new Exception("12");
}
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }catch (ArithmeticException e)
    {
       System.out.println( e.getMessage());
    }
    }
}
