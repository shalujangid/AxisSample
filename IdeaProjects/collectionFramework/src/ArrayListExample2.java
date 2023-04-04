import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Employee> l1=new ArrayList<Employee>();
        List<Employee> l2=new ArrayList<Employee>();

        Employee e1=new Employee(50000,"shalu",23);
        Employee e2=new Employee(90000,"lucky",20);
        Employee e3=new Employee(60000,"john",26);
        Employee e4=new Employee(70000,"jangid",25);

        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        //printing using for loop
        for(Employee e:l1){
            System.out.println(e.toString());
        }

        //using tostring
        System.out.println(l1.toString());

        //printing using iterator
        Iterator i=l1.iterator() ;
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }


        System.out.println();
        System.out.println(l1.contains(e1));
        System.out.println(l1.contains(e1.getName().contains("shalu")));
        System.out.println(l1.indexOf(e2));
        System.out.println(l1.get(1));
        System.out.println(l1.equals(l2));
        System.out.println(l1.size());
        System.out.println(l1.addAll(4,l2));
        System.out.println(l1.remove(2));
        System.out.println(l1.subList(2,3));
        System.out.println(l2.isEmpty());
        l1.toArray();
        System.out.println(l1);

        //adding object from other class
        List<Student> s1=new ArrayList<Student>();
        StudentObj obj=new StudentObj();

        for(int j=0;j<2;j++){
            System.out.println(obj.s[j]);
        }
        System.out.println();

        //sorting of arraylist object by name
        l1.sort(Comparator.comparing(Employee::getName));
        for(Employee e:l1){
            System.out.println(e);
        }
        System.out.println();
        l1.sort(Comparator.comparing(Employee::getAge));
        for(Employee e:l1){
            System.out.println(e);
        }


    }
}
