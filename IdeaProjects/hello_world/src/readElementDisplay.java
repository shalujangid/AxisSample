
import java.util.Scanner;

public class readElementDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum = 0;
        System.out.printf("Enter all numbers of array\n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of array are");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
