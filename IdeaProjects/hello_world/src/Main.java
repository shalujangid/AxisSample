public class Main {
    byte b=13;//size,name,value,type,default value;
    short s=37;
    int i=122234;
    long l= 1234;
    double d=3.456;
    float f = 5.5f;
    char c='a';
    boolean bln =true ;



    public static void main(String[] args) {

        Main obj1= new Main();
        obj1.i=4;
        Main obj2= new Main();
        obj2.i=7;
        System.out.println("Byte variable b = "+obj1.i);
        System.out.println("Byte variable b = "+obj2.i);

        System.out.println("Byte variable b = "+obj1.b);
        System.out.println("short variable s = "+obj1.s);
        System.out.println("int variable i = "+obj1.i);
        System.out.println("long variable l = "+obj1.l);
        System.out.println("double variable d = "+obj1.d);
        System.out.println("float variable f = "+obj1.f);
        System.out.println("character variable c = "+obj1.c);
        System.out.println("boolean variable bln = "+obj1.bln);



    }
}