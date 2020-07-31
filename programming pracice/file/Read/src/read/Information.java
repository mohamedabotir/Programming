/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read;

/**
 *
 * @author Threadig
 */
public class Information {
    private int account;
    private double balance;
    private String fname;
    private String lname;
    public Information(){
    this(0,0.0,"","");
    }
    public Information(int account,double balance, String fname,String lname){
    this.account=account;
    this.balance=balance;
    this.fname=fname;
    this.lname=lname;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
    
}
