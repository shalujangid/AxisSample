import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b\n");
        int a=sc.nextInt();
        int b=sc.nextInt();

      try{
          int x=a/b;
      }
     catch (ArithmeticException e){
          System.out.println(e.getMessage());
     }

        System.out.println("Hello world!");
    }
}