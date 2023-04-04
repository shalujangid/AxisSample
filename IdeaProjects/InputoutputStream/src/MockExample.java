import java.util.*;

public class MockExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String strArr[]=str.split(",");
        int a[]=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            a[i]=Integer.parseInt(strArr[i]);
        }
        Set al=new HashSet();
        for(int i=0;i<strArr.length;i++){
           al.add(a[i]);
        }
        String s[]= new String[]{al.toString()};
//        Object[] result= s.toArray();

    }
}
