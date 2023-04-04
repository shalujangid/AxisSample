import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set s1=new HashSet();

        s1.add(14);
        s1.add(6);
        s1.add(10);
        s1.add(13);
        s1.add(13);
        s1.add(11);
        System.out.println(s1);
        System.out.println(s1.contains(10));
        System.out.println( s1.remove(11));
        System.out.println(s1.size());

        //printing using iterator
        Iterator i=s1.iterator() ;
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

        Set s2=new TreeSet();

        s2.add(19);
        s2.add(12);
        s2.add(3);
        s2.add(15);
        System.out.println("\n"+s2);

        System.out.println(s2.addAll(s1));
        System.out.println( s2.containsAll(s1));
        System.out.println(s2.isEmpty());
        System.out.println(s2.size());
        System.out.println(s2.removeAll(s1));
        System.out.println(s2.equals(s1));







    }
}
