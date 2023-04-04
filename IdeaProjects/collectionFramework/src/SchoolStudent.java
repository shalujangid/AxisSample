import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SchoolStudent {
    public static void main(String[] args) {

        School s=new School();
        String key1="Science";
        Set<Student> set1=new HashSet<>();
        set1.add(new Student(111,"Shalu"));
        set1.add(new Student(111,"lucky"));
        set1.add(new Student(111,"Priya"));
        set1.add(new Student(111,"Ritu"));
        set1.add(new Student(111,"John"));


        String key2="Commerce";
        Set<Student> set2=new HashSet<>();
        set2.add(new Student(211,"golu"));
        set2.add(new Student(212,"minku"));
        set2.add(new Student(213,"rahul"));
        set2.add(new Student(214,"eva"));
        set2.add(new Student(215,"supriya"));


        s.getSch().put(key1,set1);
        s.getSch().put(key2,set2);

        for(Map.Entry m:s.getSch().entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
