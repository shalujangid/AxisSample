import java.util.Scanner;

public class StringEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 10 names here \n");
        String s[]=new String[10];
        for(int i=0;i<s.length;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Given order of names \n");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]+" ");
        }
        System.out.println("Names after sorting in asc order \n");
        String temp;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                if (s[i].compareTo(s[j]) > 0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

}
