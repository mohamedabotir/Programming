package com.company;

abstract public class employee {
    String firstname;
    String lastname;
    String SocitySecirityNumber;
    employee(String first,String last,String ssn)
    {
firstname=first;
lastname=last;
SocitySecirityNumber=ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocitySecirityNumber() {
        return SocitySecirityNumber;
    }

    public void setSocitySecirityNumber(String socitySecirityNumber) {
        SocitySecirityNumber = socitySecirityNumber;
    }

    @Override
    public String toString() {
        return String.format("Employee Information System:"+getFirstname()+getLastname()+" :"+getSocitySecirityNumber());
    }
    abstract  double earning();

}
