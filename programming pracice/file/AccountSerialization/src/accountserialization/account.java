/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountserialization;

import java.io.Serializable;

/**
 *
 * @author Threading
 */
public class account implements Serializable{
    int account;
    String fname,lname;
    double balance;
    account(){
    this(0,"","",0.0);
    }
    account(int account,String fname,String lname,double balance){
    this.account=account;
    this.balance=balance;
    this.fname=fname;
    this.lname=lname;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getBalance() {
        return balance;
    }
}
