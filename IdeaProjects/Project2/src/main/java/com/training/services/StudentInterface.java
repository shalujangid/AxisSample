package com.training.services;

import com.training.entities.Student;

import java.util.ArrayList;

public interface StudentInterface {
    public void getAll();
    public void getAllById(Student s);
    public void addNewStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(Student s);

}
