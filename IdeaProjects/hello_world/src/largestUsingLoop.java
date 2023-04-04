
import java.util.Scanner;
public class largestUsingLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int larg = 0;
    System.out.printf("Enter all numbers\n", n);
    for (int i = 0; i < n; i++) {
        int curr_num = sc.nextInt();
        if (curr_num > larg) {
            larg = curr_num;
        }
    }
    System.out.println("largest number is " + larg);
    }
}


