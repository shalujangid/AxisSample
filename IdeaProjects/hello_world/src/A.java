public class A {
    static int a;

    int getIncrement(){
         a=a+2;
        return a;
    }
    int getdecrement(){
        a=a-1;
        return a;
    }
    A(){

    }
    A(int a){
       this.a =a;
    }

    public static void main(String[] args) {

        A a1=new A(5);
        System.out.println("value is : "+a);
        System.out.println("Increamented value is : "+a1.getIncrement());
        System.out.println("value is : "+a);
        System.out.println("Decreamented value is : "+a1.getdecrement());

    }
}
