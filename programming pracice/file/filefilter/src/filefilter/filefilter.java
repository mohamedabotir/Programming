/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 *
 * @author Threading
 */
public class filefilter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dir="E:\\film";
        File directory=new File(dir);
        FilenameFilter filter=new FileFiltring("mp4");
        String []content=directory.list(filter);
        for(int i=0;i<content.length;i++)
            System.out.println(content[i]);
    }
    
}
