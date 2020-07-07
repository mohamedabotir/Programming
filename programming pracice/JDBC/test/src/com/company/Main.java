package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
connection co=new connection();
        Connection con= null;
        try {
            con = co.getConnection();

            PreparedStatement ps;
            ps = con.prepareStatement("insert into tax values(?,?,?)");

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.println("enter id");
                String s1 = null;
                try {
                    s1 = br.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                int id = Integer.parseInt(s1);

                System.out.println("enter name");
                String name = null;
                try {
                    name = br.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                System.out.println("enter salary");
                String s3 = null;
                try {
                    s3 = br.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                int salary = Integer.parseInt(s3);

                try {
                    ps.setInt(1, id);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    ps.setString(2, name);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    ps.setInt(3, salary);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                System.out.println("commit/rollback");
                String answer = br.readLine();
                if (answer.equals("commit")) {
                    con.commit();
                }
                if (answer.equals("rollback")) {
                    con.rollback();
                }


                System.out.println("Want to add more records y/n");
                String ans = null;
                try {
                    ans = br.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                if (ans.equals("n")) {
                    break;
                }

            }
            con.commit();
            System.out.println("record successfully saved");

            con.close();//before closing connection commit() is called
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}

