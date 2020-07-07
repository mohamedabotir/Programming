package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connection {
    int port;
    String name,password,servername,DB;
    public   connection()
    {this.name="root";
        this.password="Kampo";
        this.servername="localhost";
        this.DB="h";
        this.port=3307;
    }
    Connection getConnection() throws SQLException {
        Properties connection_info=new Properties();
        connection_info.put("user",name);
        connection_info.put("password",password);
        return DriverManager.getConnection("jdbc:mysql://"+servername+":"+port+"/"+DB,connection_info);
    }
}
