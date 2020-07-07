package com.company;
//Boxing uses in argument or return with methods
public class Main {

public static int Boxing(Integer s)
{
	return s;
}
    public static void main(String[] args) {
	Integer i=new Integer(500);//unBoxing

	int unboxing=i.intValue();
	System.out.println(i+":unBoxing:"+unboxing);
	Integer s=700;//AutoBoxing
	int autoBoxing=s;//AutoBoxing
        System.out.println(s+":autoBoxing:"+autoBoxing);
        //method
		Integer m=Boxing(250);
		System.out.println("Methods Boxing:"+m);
    }
}
