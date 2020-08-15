/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountserialization;

import java.io.IOException;

/**
 *
 * @author Threading
 */
public class AccountSerialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      // add client=new add();
      // client.open();
       //client.add();
        Read s=new Read();
        s.open();
        s.read();
        s.closeFile();
    }
    
    
}
