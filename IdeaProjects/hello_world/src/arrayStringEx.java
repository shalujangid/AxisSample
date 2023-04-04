import java.util.Scanner;

public class arrayStringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter characters\n");
        char[] a=sc.next().toCharArray();
        System.out.println("Elements of array are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
