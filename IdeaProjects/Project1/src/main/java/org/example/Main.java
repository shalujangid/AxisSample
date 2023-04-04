package org.example;

import java.sql.*;

public class Main {
    public static Connection getConnection() throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesqx","root","123@password");
        System.out.println(con);
        return con;
    }
    public static void main(String[] args) throws SQLException {
        System.out.println("hello");
        Connection con=getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from employee");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
        con.close();

    }
}





















//       try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection(
//                     "jdbc:mysql://localhost:3306/employeesqx","root","123@password");
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("select * from employee");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//            con.close();
//        }catch(Exception e){ System.out.println(e);}