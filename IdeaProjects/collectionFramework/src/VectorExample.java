import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> vlist= new Vector<String>();
        List<String> vlist2= new Vector<String>();
        //v1
        vlist.add("Singapore");
        vlist.add("India");
        vlist.add("USA");
        vlist.add("UK");
        vlist.add("Australia");

        Iterator i = vlist.iterator() ;
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }

        System.out.println();
        System.out.println(vlist.contains("banana"));
        System.out.println(vlist.indexOf(3));
        System.out.println(vlist.get(1));
        System.out.println(vlist.equals(vlist2));
        System.out.println(vlist.size());
        System.out.println(vlist.addAll(4,vlist));
        System.out.println(vlist.remove(2));
        System.out.println(vlist.subList(2,3));
        System.out.println(vlist.isEmpty());
        vlist.toArray();
        System.out.println(vlist);


    }
}
