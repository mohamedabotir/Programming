/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threading
 */
public class add {
    private ObjectOutputStream out;
    public void open() throws IOException{
        try {
            out=new ObjectOutputStream(new FileOutputStream("Cilent.clr",true));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}
public void add(){
account record;
java.util.Scanner in=new java.util.Scanner(System.in);
int accountNumber = in.nextInt(); // account number for record object
 String firstName=in.next();
String lastName=in.next(); // first name for record object String lastName; // last name for record object
 double balance=in.nextDouble(); // balance for record object

record=new account(accountNumber,firstName,lastName,balance);
        try {
            out.writeObject(record);
        } catch (IOException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
