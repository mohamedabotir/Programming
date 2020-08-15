/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountserialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threading
 */
public class Read{
     
    ObjectInputStream input;
    void open(){
        try {
            input=new ObjectInputStream(new FileInputStream("Cilent.clr"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SecurityException e){
        System.out.println("No Permission");
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void read(){
        account record;
   // account number for record object
       
            try {
                while(true){
         
         record=(account) input.readObject();
                System.out.printf( "%-10d%-12s%-12s%10.2f\n",
record.getAccount(), record.getFname(),
record.getLname(), record.getBalance() );
                }
            } catch (IOException ex) {
                Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
            }
       

    }
    public void closeFile()
{
try // close file and exit
{
if ( input != null )
{
 input.close();
}// end try
}
 catch ( IOException ioException )
 {
 System.err.println( "Error closing file." );
 System.exit( 1 );
 } // end catch
 } // end method
}
