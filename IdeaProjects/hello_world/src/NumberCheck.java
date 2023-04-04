public class NumberCheck {

    static void displayBigNumber(int x,int y,int z){
        if(x > y && x > z)
        {
            System.out.println(x+" Largest number ");
        }
        else if(y > z)
        {
            System.out.println(y+" Largest number ");
        }
        else
        {
            System.out.println(z+" Largest number ");
        }
    }
    static void greatestNumber(int a,int b,int c,int d,int e){
        if (a>b && a>c && a>d && a>e)
        {
            System.out.println(a+" Largest number ");
        }
        else if (b>c && b>d && b>e)
        {
            System.out.println(b+" Largest number ");
        }
        else if (c>d && c>e)
        {
            System.out.println(c+" Largest number ");
        }
        else if (d>e)
        {
            System.out.println(d+" Largest number ");
        }
        else
        {
            System.out.println(e+" Largest number ");
        }
    }
    public static void main(String[] args) {
        displayBigNumber(3,6,7);
        greatestNumber(3,5,1,8,0);
    }
}


