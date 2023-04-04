public class Trainee extends Employee {
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary=salary;
    }

    @Override
    public void calculateTransportAllowance() {
        super.calculateTransportAllowance();
    }
}
