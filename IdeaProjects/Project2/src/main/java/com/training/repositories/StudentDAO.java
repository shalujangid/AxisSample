package com.training.repositories;

import com.training.entities.Student;
import com.training.services.StudentServices;
import com.training.util.DBcon;
//import com.training.util.DBcon;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class StudentDAO implements StudentDaoInterface{
    Scanner sc=new Scanner(System.in);
    public boolean check(int id){
        ResultSet rs;
        try {
            DBcon.getConnection();
            Statement stmt = DBcon.con.createStatement();
            rs = stmt.executeQuery("select * from student where rno=" +id);
            if (rs.next() == true)
                return true;
            else
                return false;
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Student> getAll()
    {
        ArrayList<Student> a=new ArrayList<Student>();
        ResultSet rs;
        Student s;
        try{
           DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            rs=stmt.executeQuery("select * from student");
            while(rs.next()){
                s=new Student();
                int rno=rs.getInt(1);
                String name=rs.getString(2);
                String email=rs.getString(3);
                String phone=rs.getString(4);
                s.setRno(rno);
                s.setSname(name);
                s.setEmail(email);
                s.setPhone(phone);
                a.add(s);
            }
            System.out.println("All student data: ");
            for(Object o:a){
                System.out.println(o);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
       return a;
    }
    public ArrayList<Student> getAllById(Student s)
    {
        ArrayList<Student> a=new ArrayList<Student>();
        ResultSet rs;
        try{
            DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            rs=stmt.executeQuery("select * from student where rno="+s.getRno());
            while(rs.next())
            {
                int rno=rs.getInt(1);
                String name=rs.getString(2);
                String email=rs.getString(3);
                String phone=rs.getString(4);
                s.setRno(rno);
                s.setSname(name);
                s.setEmail(email);
                s.setPhone(phone);
                a.add(s);
            }
            for(Object o:a){
                System.out.println(o);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return a;
    }

    public void addNewStudent(Student s)
    {
        try
        {
            DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            String q1 = "insert into student values('" +s.getRno()+ "', '" +s.getSname()+
                    "', '" +s.getEmail()+ "', '" +s.getPhone()+ "')";
            int r = stmt.executeUpdate(q1);
            if(r>0)
                System.out.println("Successfully Inserted\n");
            else
                System.out.println("Something went wrong\n");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    public void updateStudent(Student s)
    {
        try
        {
            DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            String q1 = "UPDATE student set name = '" + s.getSname() +
                    "', email='"+s.getEmail()+"', phone='"+s.getPhone()+"' WHERE rno = '" +s.getRno()+ "'";
            int r = stmt.executeUpdate(q1);
            if(r>0)
                System.out.println("Successfully Updated\n");
            else
                System.out.println("Something went wrong\n");
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void deleteStudent(Student s)
    {
        try
        {
            DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            String q1 = "delete from student WHERE rno = '" +s.getRno()+ "'";
            int r = stmt.executeUpdate(q1);
            if(r>0)
                System.out.println("Successfully deleted");
            else
                System.out.println("Something went wrong");

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
