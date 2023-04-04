import java.io.Serializable;

public class Employee implements Serializable {
    int Salary;
    String name;
    transient int age;

    public Employee() {
    }

    public Employee(int salary, String name, int age) {
        Salary = salary;
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("The salary of employee is "+Salary);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
