public class Employee {
    int Salary;
    String name;
    int age;


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


}
