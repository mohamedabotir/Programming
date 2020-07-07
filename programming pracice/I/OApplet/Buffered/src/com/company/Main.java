package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] str=new String[100];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pr=new PrintWriter(System.out,true);
        pr.println("a7ooooooooo");
        for(int i=0; i<100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("\nHere is your file:");
// display the lines
        for(int i=0; i<100; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
