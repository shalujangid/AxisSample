package org.example;

import com.exercise.entities.Loan;
import com.exercise.services.LoanServiceInterface;
import com.exercise.services.LoanServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoanServices ls=new LoanServices();
        Loan l=new Loan();
        Scanner sc=new Scanner(System.in);
        String task="yes";
        do{
            ls.viewLoansBasedOnType(l);
                System.out.println("Do you want to searched again the loan type (yes/no)");
                task=sc.nextLine();
                if(task.equalsIgnoreCase("no")){
                    System.exit(0);
            }
        }while(task.equalsIgnoreCase("yes"));
    }
}