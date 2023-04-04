import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StusentObjSorting {
    public static void main(String[] args) {
        List<Student> s1=new ArrayList<Student>();
        StudentObj obj=new StudentObj();
        for(int j=0;j<obj.s.length;j++){
            System.out.println(obj.s[j]);
        }
        for(int j=0;j<obj.s.length;j++){
            System.out.println(s1.add(obj.s[j]));
        }
        //sorting of arraylist object by name
//        s1.sort(Comparator.comparing(Student::obj));
//        for(Student e:s1){
//            System.out.println(e);
//        }
//        System.out.println();
//        s1.sort(Comparator.comparing(Student::getAge));
//        for(Student e:s1){
//            System.out.println(e);
//        }
    }
}
