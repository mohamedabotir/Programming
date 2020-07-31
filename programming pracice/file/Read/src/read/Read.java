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
public class Read {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadFile file=new ReadFile();
        file.openFile();
        file.read();
        file.closeFile();
    }
    
}
