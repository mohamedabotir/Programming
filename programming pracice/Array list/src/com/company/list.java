package com.company;

import java.util.ArrayList;

public class list {
    ArrayList <String> o=new ArrayList<>();
    void inserData(String ... data)
    {
        for (String s:data)
        o.add(s);

        o.trimToSize();

    }
    void Remove(String data)
    {
        o.remove(data);
    }
    void Display()
    {
        int size=o.size();
        System.out.println(size);
        for (int i=0;i<size;i++)
        { System.out.printf("%s\n",o.get(i));
        }
    }
    void ensureCapacity(int currentcapacity,int newCapacity)
    {

    }
}
