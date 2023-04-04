import java.util.Scanner;

//Password Generation
//        IDFC, a leading Bank sector offers online shopping to their customers, To avail this offer, the customer will have to generate a security code, for the first time usage of his card to purchase online.
//
//        Hint to generate a security code is as follows :
//
//        Minimum of 8 Characters Must contain atleast one uppercase, one lowercase and one special character. Only the special characters @,*,# are allowed. The code fails to meet the criteria, will response with an error message as shown in the sample output.
//
//        Develop an application to implement this scenario.
//
//        Write a public class Main with the main method. Write the code to get the input, validate and print the output.
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