package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class Main {
  public  static int count=0;

public static void Counter()
{
    count++;
}
    public static void main(String[] args) {
	cs o=new cs();
	o.my(12,"mohamed");
    Counter();
	Counter();
	System.out.println(count);
	String arr[]={"Mohamed","Kampo","Suze"};
	o.store(arr);
    }
}
