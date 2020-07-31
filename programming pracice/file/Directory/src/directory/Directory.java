/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directory;

/**
 *
 * @author Threading
 */
import java.io.File;
import java.util.Scanner;
public class Directory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        git(out.nextLine());
    }
    public static void git(String name){
    File path= new File(name);
    if(path.isFile())
    {
    System.out.println("Name:"+path.getName());
    System.out.println("Size:"+(path.length())/(1024.0*1024)+" MB");
    System.out.println("ISFolderByName:"+path.mkdir());
    System.out.println(path.getAbsolutePath());
    }
    else if(path.isDirectory()){
    String data[]=path.list();
    int count=0;
    for(int i=0;i<data.length;i++)
    {
        File h=new File("E:\\books\\programming\\"+data[i]);
        
    System.out.println("Name:"+h.getName());
    System.out.println("Size:"+(h.length())/(1024.0*1024)+" MB");
    System.out.println("ISFolderByName:"+h.mkdir());
    System.out.println(h.getAbsolutePath());}}
    System.out.println("-------------------------------->");

    }}
    
    
    /*
System.out.println("Name:"+h.getName());
    System.out.println("Size:"+(h.length())/(1024.0*1024)+" MB");
    System.out.println("ISFolderByName:"+h.mkdir());
    System.out.println(h.getAbsolutePath());}}
    System.out.println("-------------------------------->");
*/
        

