public class A
{
    int a;



    public class B
    {
        int c;

        String display()
        {

            System.out.println(display2());
            return "in class B";
        }
    }
    String display2()
    {

        B b=new B();
        b.display();
        class d{

        }
       Thread t=new Thread(){
            public void run(){
                System.out.println("this thread 2");
            }
        };
        t.start();
        System.out.println("in class A");

        new Thread(()->System.out.println("this thread")).start();
        return "This method executed";
    }

    public static void main(String[] args) {
        A a= new A();
        a.display2();
//        B b =new B();//with static class
        B b =a.new B();
        b.display();
    }

}
