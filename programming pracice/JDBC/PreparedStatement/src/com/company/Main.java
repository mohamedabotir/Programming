package com.company;
import org.omg.CORBA.TRANSACTION_ROLLEDBACK;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws SQLException {

	 connection con=new connection();
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;//update salary
        PreparedStatement ps3=null;//update name
        PreparedStatement ps4=null;
        Connection co=null;
        try {
boolean helper=true;
co= con.getConnection();
co.setAutoCommit(false);
ps1=co.prepareStatement("select *from tax ");

            ps2=co.prepareStatement("insert into tax values(?,?,?,?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CLOSE_CURSORS_AT_COMMIT);
            ps3=co.prepareStatement("update tax set final=? where id=?");
            ps4=co.prepareStatement("update tax set name=? where id=?");


       /*    ps2.setInt(1,771);
           ps2.setString(2,"3abdoWednou");
           ps2.setDouble(3,2500.99);
           ps2.setDouble(4,1.5);
           ps2.setDouble(5,1239);
           int a= ps2.executeUpdate();*/

            ps3.setDouble(1,2500.99-(1.5/100)*2500.99+255+220);
            ps3.setInt(2,6);
            ps3.executeUpdate();
            ps4.setString(1,"tetosssdz");
            ps4.setInt(2,1);
            ps4.executeUpdate();
            co.commit();


            ResultSet rs=ps1.executeQuery();
while (rs.next())
{
    System.out.println("ID:"+rs.getInt("id")+" Name:"+rs.getString("name")+" Salary:"+rs.getString("final"));
}

        } catch (SQLException e) {
            if (con != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    co.rollback();
                } catch(SQLException excep) {

                }
                e.printStackTrace();
        }

        }
        finally {
            try{
            if (ps1!=null)
                ps1.close();
            if (ps2!=null)
                ps2.close();
            if (ps3!=null)
                ps3.close();
            if (ps4!=null)
                ps4.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
               // co.setAutoCommit(true);
            co.close();
            }
        }
    }

