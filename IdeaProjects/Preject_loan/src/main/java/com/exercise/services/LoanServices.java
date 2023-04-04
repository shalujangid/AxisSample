package com.exercise.services;

import com.exercise.entities.Loan;
import com.exercise.repositories.LoanManagementSystem;

import java.util.Scanner;

public class LoanServices implements LoanServiceInterface{
    LoanManagementSystem lm=new LoanManagementSystem();

    public void viewLoansBasedOnType(Loan l){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of loan to be searched");
        String LoanType=sc.nextLine();
        if(LoanType.matches("^[A-Za-z][A-Za-z ]+$") && LoanType!=null){
            l.setLoanType(LoanType);
            lm.viewLoansBasedOnType(l);
        }
        else
            System.out.println("Error!");
    }
}
