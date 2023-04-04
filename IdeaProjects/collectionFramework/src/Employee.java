public class Employee {
    int Salary;
    String name;
    int age;

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

    public void Employee(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("The age of employee is not valid");
        }
        else{
            System.out.println("The employee age is valid");
        }
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
