package com.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
    public static Connection con;
    public static void getConnection() throws SQLException {
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesqx","root","123@password");
//        System.out.println(con);
    }


}
