/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package write;

/**
 *
 * @author Threadig
 */
public class Write {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WriteFile s=new WriteFile();
       s.openfile();
       s.write();
       s.closeFile();
    }
    
}
