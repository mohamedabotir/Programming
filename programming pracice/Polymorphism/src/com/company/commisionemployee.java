package com.company;

public class commisionemployee extends employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    commisionemployee(String first, String last, String ssn,double sales,double rate) {
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate );
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate>0.0&&commissionRate<1)
        this.commissionRate = commissionRate;
        else
            throw new IllegalArgumentException("No Valid Argument");
    }

    public void setGrossSales(double grossSales) {
        if(grossSales>0.0)
        this.grossSales = grossSales;
        else
            throw new IllegalArgumentException("no valid Argument");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public String toString() {
        return String.format("GrossRate:"+getGrossSales()+" CommissionRate:"+getCommissionRate());
    }

    @Override
    double earning() {
        return getCommissionRate() * getGrossSales();
    }
}
