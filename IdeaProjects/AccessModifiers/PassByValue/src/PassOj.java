public class PassOj {
    public static void main(String[] args) {
        Test t1=new Test(100,12);
        System.out.println("Object state before alterPremitive method call t1.a: "+t1.a+" t1.b: "+t1.b);
        t1.alterPremitives(t1.a,t1.b);
        System.out.println("Object state after alterPremitive method call t1.a: "+t1.a+" t1.b: "+t1.b);
        System.out.println();
        System.out.println("Object state before alterObject method call t1.a: "+t1.a+" t1.b: "+t1.b);
        t1.alterObject(t1);
        System.out.println("Object state before alterObject method call t1.a: "+t1.a+" t1.b: "+t1.b);
    }
}
