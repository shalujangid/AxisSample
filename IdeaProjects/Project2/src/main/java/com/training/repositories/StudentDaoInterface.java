package com.training.repositories;

import com.training.entities.Student;

import java.util.ArrayList;

public interface StudentDaoInterface
{
    public ArrayList<Student> getAll();
    public ArrayList<Student>  getAllById(Student s);
    public void addNewStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(Student s);
}
