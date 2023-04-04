public class StringConstructorDemo {
    public static void main(String[] args) {
        String s1 ="Hello World";
        String s2=new String("hello world");
        char chars[]={'a','b','c','d'};
        String s3=new String(chars);
        byte bytes[]={'a','b','c','d'};
        String s4=new String(bytes);
        String s5=new String(s2);
        String s6=new String(bytes,1,4);
        String s7=s1;
        System.out.println(s1);
        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s5);
//        System.out.println(s6);
//        System.out.println(s7);

    }
}
