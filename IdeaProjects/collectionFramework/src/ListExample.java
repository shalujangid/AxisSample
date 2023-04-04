import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        ArrayList list1=new ArrayList();
        List list2=new ArrayList();

        //list1
        list1.add("Apple");
        list1.add(20);
        list1.add("lemon");
        list1.add("banana");
        list1.add(2,"tomato");

        //list2
        list2.add("potato");
        list2.add("abc");

        System.out.println(list1.contains(20));
        System.out.println(list1.indexOf("lemon"));
        System.out.println(list1.get(1));
        System.out.println(list1.toString());
        System.out.println(list1.equals(list2));
        System.out.println(list1.size());
        System.out.println(list1.addAll(4,list2));
        System.out.println(list1.remove(2));
        System.out.println(list1.subList(2,4));
        System.out.println(list1.clone());
        System.out.println(list1.isEmpty());
        System.out.println(list1);
        for(Object o:list1){
            System.out.print(o+" ");
        }
        Iterator i=list2.iterator() ;
         while(i.hasNext()){
             System.out.print(i.next()+" ");
         }
        list2.clear();
         System.out.println();
        System.out.println(list2.isEmpty());
    }
}
