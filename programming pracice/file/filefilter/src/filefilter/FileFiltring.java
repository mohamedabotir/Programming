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
public class FileFiltring implements FilenameFilter{
String ext;
public FileFiltring(String ext) {
this.ext = "." + ext;
}

   @Override
    public boolean accept(File file, String string) {
        return string.endsWith(ext);
    }
    
}
