import java.util.*;

public class EmpSorting {
    public static void main(String[] args) {
        List<Employee> l1=new ArrayList<Employee>();
        Employee e1=new Employee(50000,"shalu",23);
        Employee e2=new Employee(90000,"lucky",20);
        Employee e3=new Employee(60000,"john",26);
        Employee e4=new Employee(70000,"jangid",25);
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        System.out.println("Employee list before sorting:");
        for(Employee e:l1){
            System.out.println(e.toString());
        }
        System.out.println();
        //sorting of arraylist object by name
        System.out.println("Employee list after sort by name:");
        l1.sort(Comparator.comparing(Employee::getName));
        for(Employee e:l1){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Employee list after sort by age:");
        l1.sort(Comparator.comparing(Employee::getAge));
        for(Employee e:l1){
            System.out.println(e);
        }

//        Collections.sort(Employee new Comparator<Employee>(){
//            @Override
//            public int compare(Employee employee, Employee t1) {
//                return Integer.compare(employee.age,employee.age);
//            }
//        })
    }
}
