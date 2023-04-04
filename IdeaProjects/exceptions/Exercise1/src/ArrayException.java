import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public void getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the price details");
        try{
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input was not in the correct format");
        }

        try{
            System.out.println("Enter the index of the array element you want to access");
            int index= sc.nextInt();
            System.out.println("The array element is "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of range");
        }

    }
    public static void main(String[] args) {
        ArrayException a=new ArrayException();
            a.getPriceDetails();
    }
}
