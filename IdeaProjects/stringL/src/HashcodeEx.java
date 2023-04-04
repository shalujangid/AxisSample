import java.lang.Object;
public class HashcodeEx {




    public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

    }


}
