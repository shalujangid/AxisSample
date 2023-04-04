public class operatorEx {

    public static void main(String[] args) {
        /* unary -2
        binary:
        arithmetic: +,-,*,/,%
        logical:&&,||
        relations : <,>,<=,>=,==
        assignment:=
        increament and decreament
        bitwise
         */

        int a=4;
        int b=8;
        int x=2;

        /*unary*/
        int y=-a;
        System.out.println(y);

       /* arithmetic */
        double c=(a+b);
        System.out.println(c);
        double c1=(a*b);
        System.out.println(c1);
        boolean c2=a%2==0;    /* Modulus */
        System.out.println(c2);
        double c3=(a+b*a)/a;
        System.out.println(c3);

        /*relational*/
        boolean d = a<b ;
        System.out.println(d);
        boolean p = a>=b ;
        System.out.println(p);

        /* logical*/
        boolean e = ((x<a)&&(x<b));
        System.out.println(e);

        /*increament and decrement*/
        int f= a++;
        int g= b--;
        int h=++a;
        int i=--b;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

          /*assignment*/
        int j=b+=10;
        System.out.println(j);
        int o=b-=2;
        System.out.println(o);

        /*bitwise*/
        int k=a&b;
        System.out.println(k);
        int l=a|b;
        System.out.println(l);

        /*shift operator*/
        int m=a<<1;
        System.out.println(m);
        int n=b>>1;
        System.out.println(n);

        /*ternary*/
        int ab=(a<b)?(x+1):(x-1);
        System.out.println(ab);











    }
}
