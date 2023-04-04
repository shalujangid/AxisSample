import java.util.Scanner;
public class arrayFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[]=new float[n];

        //reading and display
        System.out.printf("Enter all numbers of array\n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        System.out.println("Elements of array are");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        //largest element
//
        //sum of element

    }
}
