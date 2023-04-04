import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Security Code \n");
        String pass=sc.nextLine();
        if(pass.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[@#*]).{8,})") ){
            System.out.println("Security Code Generated Successfully");
        }
        else
        {
            System.out.println("\n" + "Invalid Security Code, Try Again!");
        }
    }













//    private static void Validation(String pass) {
//        if(pass.matches(".*[@#*]{1,}.*") && pass.length() >=8 && pass.matches(".*[A-Z]{1,}.*") && pass.matches(".*[a-z]{1,}.*")){
//            System.out.println("Security Code Generated Successfully");
//        }
//        else{
//            System.out.println("\n" + "Invalid Security Code, Try Again!");
//        }
//    }
}