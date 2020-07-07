package com.company;

public class SalariedEmployee extends employee {
    private double weeklysalary;
    SalariedEmployee(String first, String last, String ssn,Double salary) {
        super(first, last, ssn);
        setWeeklysalary(salary);

    }

    public void setWeeklysalary(double salary) {
       if (salary>0.0)
        this.weeklysalary = salary;
       else {
           throw  new IllegalArgumentException("Salary Undefined");
       }
    }

    public double getWeeklysalary() {
        return weeklysalary;
    }

    @Override
    double earning() {
        return getWeeklysalary();
    }

    @Override
    public String toString() {
            return String.format( super.toString()+"Salary per Week:"+getWeeklysalary());
    }
}
