/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Threading
 */

public class date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
        StringTokenizer st=new StringTokenizer(d.toString());
        System.out.println(st.nextToken("EER"));
        System.out.println(fm.format(d));
        long msc=d.getDate();
        System.out.println(msc);
    }
    
}
