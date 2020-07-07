package com.company;

import java.util.Random;

public class choose {
    Random rn=new Random();
    Case Answer(){
       int pro= (int) ((int)100*rn.nextDouble());
        if (pro < 15)
            return Case.MAYBE; // 15%
        else if (pro < 30)
            return Case.NO; // 15%
        else if (pro < 60)
            return Case.YES; // 30%
        else if (pro < 75)
            return Case.LATER; // 15%
        else if (pro < 98)
            return Case.SOON; // 13%
        else
            return Case.NEVER; // 2%
    }
    }

