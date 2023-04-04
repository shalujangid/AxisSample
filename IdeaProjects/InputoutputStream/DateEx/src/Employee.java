import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
public class Employee  {
    List<Employee> l;
    void addEmpInList(Employee o){
        l=new ArrayList<>();
        l.add(o);
    }
    int Salary;
    String name;
    LocalDate doj;
    LocalDate dob;

    public Employee()
    {

    }

    public Employee(int salary, String name, LocalDate doj, LocalDate dob)
    {
        Salary = salary;
        this.name = name;
        this.doj = doj;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", dob=" + dob +
                '}';
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
