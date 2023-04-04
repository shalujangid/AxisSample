package com.training.services;

import com.training.entities.Student;
import com.training.repositories.StudentDAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentServices {
    Scanner sc=new Scanner(System.in);
    StudentDAO stDao=new StudentDAO();
    boolean emailValidation(String Email){
        boolean check=false;
        if(Email.matches("^(.+)@(\\S+)$"))
            check=true;
        else
            check=false;
        return check;
    }
    boolean nameValidation(String name){
        boolean check=false;
        if(name.matches("^[A-Za-z][A-Za-z ]+$"))
            check=true;
        else
            check=false;
        return check;
    }
    boolean phoneValidation(String phone){
        boolean check=false;
        if(phone.matches("^[0-9]{10}$"))
            check=true;
        else
            check=false;
        return check;
    }

    public void getAll()
    {
        stDao.getAll();
    }

    public void getAllById(Student s)
    {
        System.out.println("To get student data by id: ");
        System.out.println("Please enter student id:");
        int id=sc.nextInt();
        if(id!=0)
        {
            if (stDao.check(id) == true)
            {
                s.setRno(id);
                stDao.getAllById(s);
            }
        }
    }
    public void addNewStudent(Student s)
    {
        System.out.println("To add a new student please provide following details: ");
        System.out.println("Please enter student id:");
        int id=sc.nextInt(); sc.nextLine();
        if(id!=0) {
            if (stDao.check(id) == false) {
                System.out.println("Please enter student name:");
                String name = sc.nextLine();
                System.out.println("Please enter student email:");
                String email = sc.nextLine();
                System.out.println("Please enter student phone number:");
                String phone = sc.nextLine();
                if (nameValidation(name) == true && name != null && emailValidation(email) == true && email != null && phoneValidation(phone) == true && phone != null) {
                    s.setRno(id);
                    s.setSname(name);
                    s.setEmail(email);
                    s.setPhone(phone);
                    stDao.addNewStudent(s);
                } else {
                    System.out.println("Error! Please write details in required format.");
                }
            } else {
                System.out.println("This roll number already exist! You cannot add two student with same roll number");
            }
        }else{
            System.out.println("Error!");
        }
    }

    public void updateStudent(Student s){

        System.out.println("Provide student roll number to update student data: ");
        int rno=sc.nextInt();
        sc.nextLine();
        if(rno!=0){
            if(stDao.check(rno)==true)
            {
                System.out.println("Please enter student name:");
                String name = sc.nextLine();
                System.out.println("Please enter student email:");
                String email = sc.nextLine();
                System.out.println("Please enter student phone number:");
                String phone = sc.nextLine();
                if (rno != 0 && nameValidation(name) == true && name != null && emailValidation(email) == true && email != null && phoneValidation(phone) == true && phone != null) {
                    s.setRno(rno);
                    s.setSname(name);
                    s.setEmail(email);
                    s.setPhone(phone);
                    stDao.updateStudent(s);
                } else {
                    System.out.println("Error! Please write details in required format.");
                }
            }
            else{
                System.out.println("This roll number doesn't exist!");
            }
        }else{
            System.out.println("Error!");
        }
    }
    public void deleteStudent(Student s){
        System.out.println("Provide student roll number to delete student data: ");
        int rno=sc.nextInt();
        if(rno!=0)
        {
            if(stDao.check(rno)==true)
            {
                s.setRno(rno);
                stDao.deleteStudent(s);
            }
            else
            {
                System.out.println("This roll number doesn't exist!");
            }
        }
        else
        {
            System.out.println("Error!");
        }
    }
}
