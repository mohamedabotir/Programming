/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package write;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threadig
 */
public class WriteFile {
    private Formatter output;
    void openfile(){
        try {
            output=new  Formatter("Client.txt");
        }catch(SecurityException ex){
        System.err.println("Can't Access You haven't Permission");
        System.exit(0);
        }
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    void write(){
    Scanner input=new Scanner(System.in);
    Information  acc=new Information();
    System.out.printf( "%s\n%s","Enter account number (> 0), first name, last name and balance.", "? " );
    acc.setAccount(input.nextInt());
    acc.setBalance(input.nextDouble());
    acc.setFname(input.next());
    acc.setLname(input.next());
    try{
    if(acc.getBalance()>0.0)
       output.format( "%s %s %s %.2f\n", acc.getAccount(),
acc.getFname(), acc.getLname(),
acc.getBalance() ); 
    }
    catch ( FormatterClosedException formatterClosedException ){
    System.err.println( "Error writing to file." );
    return;
    }
    catch ( NoSuchElementException elementException ){
    System.err.println( "Invalid input. Please try again." );
    input.nextLine();
    }
    }
    void closeFile(){
    if(output!=null)
    output.close();
    }
}
