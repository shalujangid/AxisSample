import java.util.Scanner;
public class arrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int larg = 0;
        System.out.printf("Enter all numbers of array\n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }
        System.out.println("largest number is " + larg);
    }
}
