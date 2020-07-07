package com.company;

public class HoulryEmployee extends employee {
    private double wege;//per week
private double hours;//hourse worked per week
    HoulryEmployee(String first, String last, String ssn,double w,double h)
    {
        super(first, last, ssn);
        setWege(w);
        setHours(h);
    }

    public void setHours(double hours) {
       if ( ( hours >= 0.0 ) && ( hours <= 168.0 ) )
        this.hours=hours;
       else
           throw new IllegalArgumentException("Hourse Under logical or Over");

    }

    public void setWege(double wege) {
        if (wege>=0.0)
        this.wege = wege;
        else
            throw new IllegalArgumentException("wege Under Zero ");
    }

    public double getHours() {
        return hours;
    }

    public double getWege() {
        return wege;
    }

    @Override
    double earning() {
        if (getHours()<=40)
            return getWege()*getHours();
        else
            return 40 * getWege() + ( getHours() - 40 ) * getWege() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Worked Hours Per Week:"+getHours()+" Wage Per Hour:"+getWege());

    }
}
