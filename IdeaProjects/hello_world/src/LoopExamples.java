import java.util.Scanner;
public class LoopExamples {
    static String getWordDigit(int n){
        String str="";
        switch (n) {
            case 1:
                str = "one ";
                break;
            case 2:
                str ="two ";
                break;
            case 3:
                str ="three ";
                break;
            case 4:
                str ="four ";
                break;
            case 5:
                str ="five ";
                break;
            case 6:
                str ="six ";
                break;
            case 7:
                str ="seven ";
                break;
            case 8:
                str ="eight ";
                break;
            case 9:
                str ="nine ";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        // factorial of a number
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int i,factorial=1;
        for(i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);

        // sum of digits of a number or check num is palindrome or not
        int n,na;
        System.out.print("Enter a number to sum its digits: ");
        n=sc.nextInt();
        int sum = 0;
        String str="";
        while (n != 0)
        {
            sum = sum + n%10;
            na=n%10;
            str=str+ getWordDigit(na);
            n = n/10;
        }
        System.out.print(str+" = "+sum);
        System.out.println();
        //also checking that number is palindrome or not



        //Display prime number
        int index,num,counter, j;
        System.out.print("Enter the value : ");
        num=sc.nextInt();
        System.out.print("Prime numbers are ");
        for(j=2;j<=num;j++){
            counter=0;
            for(index=1;index<=j;index++){
                if(j%index==0){
                    counter++;
                }
            }
            if(counter==2) {
                System.out.print(j+" ");
            }

        }

        //check for prime number
        int a,m=0,flag=0;
        int num2=sc.nextInt();
        m=num2/2;
        if(num2==0||num2==1){
            System.out.println(num2+" is not prime  number");
        }else{
            for(a=2;a<=m;a++){
                if(n%a==0){
                    System.out.println(num2+" is not prime  number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(num2+" is prime number"); }
        }

    }
}
//palindrome
//reverse
