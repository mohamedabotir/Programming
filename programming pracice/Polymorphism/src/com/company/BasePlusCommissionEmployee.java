package com.company;

public class BasePlusCommissionEmployee extends commisionemployee {
    private double baseSalary;
    BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary>0.0)
        this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("no Valid Argument");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    double earning() {
        return getBaseSalary()+super.earning();

    }

    @Override
    public String toString() {
        return String.format("base Salaried:"+super.toString()+" base Salary:"+getBaseSalary());
    }
}
