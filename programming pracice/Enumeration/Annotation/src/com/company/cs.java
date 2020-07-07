package com.company;

import com.sun.org.glassfish.gmbal.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
@Multi()
@myAno(name = "Class of Test",Value=12)
@what(Description = "Make test over Annotation Class")
public class cs {
    @what(Description = "Make test over Annotation Methods")
    @myAno(name = "Methods",Value=12)
   public void my(int i,String d)
    {  cs ob=new cs();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
// Display all annotations for Meta2.
            System.out.println("All annotations for Meta2:");
            for(Annotation a : annos)
                System.out.println(a);
            Class c=ob.getClass();
            Method m=c.getMethod("my",int.class,String.class);
            myAno s=m.getAnnotation(myAno.class);// for single Annotation
            System.out.println(s.name()+" "+s.Value());
            annos = m.getAnnotations();
            System.out.println("All annotations for my:");
            for(Annotation a : annos)
            System.out.println(a);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    void store(String...arr){
        for (String e:arr)
            System.out.println(e);
    }
}
