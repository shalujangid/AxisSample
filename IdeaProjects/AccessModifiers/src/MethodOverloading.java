public class MethodOverloading {
    void add(){
        System.out.println("No parameters for this method");
    }
    void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Sum of three number is "+sum);
    }
    void add(String s1,String s2){
        String s3= s1+s2;
        System.out.println("The final string is "+s3);
    }
    void add(float f1,float f2){
        float f3= f1+f2;
        System.out.println("The final float sum is "+f3);
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.add();
        m.add(2,3,4);
        m.add("hello"," world!");
        m.add(2.5f,3.5f);
    }
}
