import java.util.Scanner;

public class arrayLargestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter characters\n");
        char[] a=sc.next().toCharArray();
        System.out.println("Elements of array are");
        int larg='a';
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > larg) {
                larg = a[i];
            }
        }
        System.out.println("The largest ascii value is "+larg);


    }
}

