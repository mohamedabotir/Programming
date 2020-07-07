package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Multi {
    String Type ()default "Non-test";
    double Version()default 12.1f;
}
