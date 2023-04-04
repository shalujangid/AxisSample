import java.awt.*;

public class Manager extends Employee {

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        basicSalary=salary;
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance =15*basicSalary/100;
        System.out.println("The transport allowance is "+transportAllowance);
    }
}
