package org.example;

import com.training.entities.Student;
import com.training.repositories.StudentDAO;
import com.training.services.StudentServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StudentServices ss=new StudentServices();
        Student s= new Student();
        String task;
        System.out.println("What task you want to perform..?");
        task=sc.nextLine();
        switch (task){
            case "getall":ss.getAll();
                break;
            case "getbyid":ss.getAllById(s);
                break;
            case "addnew":ss.addNewStudent(s); ss.getAll();
                break;
            case "update":ss.updateStudent(s); ss.getAll();
                break;
            case "delete":ss.deleteStudent(s); ss.getAll();
                break;
            default:ss.getAll();
        }
    }
}