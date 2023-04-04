package com.exercise.entities;

public class Loan {
    int loanid;
    String accHolderName;
    String loanType;
    String contactNumber;
    float rateOfInterest;
    float tenureOfLoan;

    public Loan() {
    }

    public Loan(int loanid, String accHolderName, String loanType, String contactNumber, float rateOfInterest, float tenureOfLoan) {
        this.loanid = loanid;
        this.accHolderName = accHolderName;
        this.loanType = loanType;
        this.contactNumber = contactNumber;
        this.rateOfInterest = rateOfInterest;
        this.tenureOfLoan = tenureOfLoan;
    }

    public int getLoanid() {
        return loanid;
    }

    public void setLoanid(int loanid) {
        this.loanid = loanid;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public float getTenureOfLoan() {
        return tenureOfLoan;
    }

    public void setTenureOfLoan(float tenureOfLoan) {
        this.tenureOfLoan = tenureOfLoan;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanid=" + loanid +
                ", accHolderName='" + accHolderName + '\'' +
                ", loanType='" + loanType + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                ", tenureOfLoan=" + tenureOfLoan +
                '}';
    }
}
