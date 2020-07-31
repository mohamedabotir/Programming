/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threadig
 */
public class ReadFile {
    private Scanner input;
    void openFile(){
        try {
            input=new Scanner(new File("Client.txt"));
        }catch(SecurityException e){
        System.err.println("You Haven't Permission");
        System.exit(0);
        } 
        catch (FileNotFoundException ex) {
           System.err.println("Can't Found!");
           System.exit(0);
        }
    }
    void read(){
    Information ac=new Information();
    System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
 "First Name", "Last Name", "Balance" );
    while(input.hasNext())
    try{
    ac.setAccount(input.nextInt());
    ac.setFname(input.next());
    ac.setLname(input.next());
    ac.setBalance(input.nextDouble());
    System.out.printf( "%-10d%-12s%-12s%10.2f\n",
ac.getAccount(), ac.getFname(),
ac.getLname(), ac.getBalance() );
    }catch(NoSuchElementException e){
    System.out.println("Error file Formate");
    input.close();
    System.exit(0);
    }
    catch ( IllegalStateException stateException )
 {
 System.err.println( "Error reading from file." );
 System.exit( 1 );
 } // end catch
 
    }void closeFile(){
    if(input!=null)
    input.close();
    }
}
