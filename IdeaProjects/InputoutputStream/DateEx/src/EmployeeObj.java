import java.util.*;
import java.text.*;
import java.time.*;


public class EmployeeObj {

    void getEmpData()
    {
        Employee e=new Employee();
        String addMore="Yes";
        int i=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter all employee data below:\n");
            if (i > 0) {
                System.out.println("Do you want to add more employees? Yes/No\n");
                addMore=sc.nextLine();
                if(addMore.equals("No")){
                    System.exit(0);
                }
            }
            System.out.println("Enter employee salary : ");
            int Salary=sc.nextInt();sc.nextLine();e.setSalary(Salary);
            System.out.println("Enter employee name : ");
            String name=sc.nextLine();e.setName(name);
            System.out.println("Enter employee date of joining : ");
            String Doj=sc.nextLine();
            LocalDate l1 = LocalDate.parse(Doj);
            e.setDoj(l1);
            System.out.println("Enter employee date of birth : ");
            String Dob=sc.nextLine();
            l1 = LocalDate.parse(Dob);
            e.setDob(l1);
            e.addEmpInList(e);
            i++;
        }while(addMore.equals("Yes"));

    }
    Employee s[]=new Employee[]{
              new Employee(50000,"john",LocalDate.of(2018, 11, 21),LocalDate.of(1998, 10, 21))
            ,new Employee(50000,"lui",LocalDate.of(2015, 02, 01),LocalDate.of(1994, 12, 21))
            , new Employee(60000,"roy",LocalDate.of(2014, 07, 01),LocalDate.of(1999, 02, 01))
            , new Employee(40000,"steve",LocalDate.of(2021, 04, 01),LocalDate.of(2000, 02, 01))
    };



}
