import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[3][4];
        int b[][]= new int[3][4];
        //array a
        System.out.println("Enter array a values\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
             a[i][j]=sc.nextInt();
            }
        }
        System.out.println("array a looks like\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //array b
        System.out.println("Enter array b values\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("array b looks like\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        // adding array a and b
        int c[][]=new int [3][4];
        System.out.println("After adding array a and b we get array c as\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
