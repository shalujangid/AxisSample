
import java.util.Scanner;
public class arraySearchElement
{
    public static void main(String[] args)
    {
        int  x, flag = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[]=new int[length];
        int sum = 0;
        System.out.printf("Enter all numbers of array\n", length);
        for (int j = 0; j< length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = sc.nextInt();
        for(i = 0; i < length; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
