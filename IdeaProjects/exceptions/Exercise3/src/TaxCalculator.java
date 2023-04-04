public class TaxCalculator {
    String empName;
    boolean isIndian;
    double empSal;


    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        double taxAmount = 0;
        if(isIndian!=true){
            throw new CountryNotValidException("The employee should be indian citizen to calculate tax");
        }
        if(empName=="" || empName==null){
            throw new EmployeeNameInvalidException("The employee should be indian citizen to calculate tax");
        }
        if(empSal>=100000 && isIndian==true){
            taxAmount=empSal*8/100;
        }
        else if(empSal<100000 && empSal>=50000){
            taxAmount=empSal*6/100;
        }
        else if(empSal<50000 && empSal>=30000){
            taxAmount=empSal*5/100;
        }
        else if(empSal<30000 && empSal>10000){
            taxAmount=empSal*4/100;
        }else{
            throw new TaxNotEligibleException("The employee should be indian citizen to calculate tax");
        }
        return taxAmount;
    }
}
