public class loopEx {
    public static void main(String[] args) {
        // Displaying 1-20 using while
        int num1=1;
        while(num1<=20){
            System.out.print(num1+" ");

            num1++;
        }
        System.out.println();
        // Displaying 1-20 even using do while
        int num2=0;
        do{
            System.out.print(num2+" ");

            num2=num2+2;
        }while(num2<=20);
        System.out.println();
        // Displaying 1-20 odd using for

        for (int num3 = 1; num3 <= 20; num3++) {
            if (num3 % 2 != 0) {
                System.out.print(num3 + " ");
            }
        }
    }
}


