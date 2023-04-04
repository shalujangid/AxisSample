package com.exercise.repositories;

import com.exercise.entities.Loan;
import com.exercise.util.DBcon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoanManagementSystem implements LoanDaoInterface {
    public void viewLoansBasedOnType(Loan l){
        ResultSet rs;
        try{
            DBcon.getConnection();
            Statement stmt=DBcon.con.createStatement();
            rs=stmt.executeQuery("select count(*) from Loan where LoanType='"+l.getLoanType()+"'");
            while (rs.next()) {
                System.out.println("Number of customers who have taken "+l.getLoanType()+" loan : "+rs.getInt(1));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
