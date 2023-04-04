public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra= 1000.50;

    public Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    void calculateSalary(){
        double salary;
        salary  =this.basicSalary+(this.basicSalary*this.specialAllowance/100)+(this.basicSalary*this.Hra/100);
        System.out.println("The calculated salary of "+employeeName+"is "+salary);
    }

    public void calculateTransportAllowance(){
        double transportAllowance =10*basicSalary/100;
        System.out.println("The transport allowance is "+transportAllowance);
    }

}
