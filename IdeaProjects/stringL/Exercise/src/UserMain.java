
import java.util.Scanner;

//Employee ID Validation
//        Global Info Technologies has approached you to develop an application to maintain the work details of their employees.
//
//        Imagine you are developing the login module. In that module,you will have to validate the id with the format given from the client.
//
//        The format is "GBL/001/0417", here the first three letters are standard. Create a class UserMain and implement the functionalities which are required.
public class UserMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        String Id=sc.nextLine();
//        String str=new String(Id);
        String regex="^GBL/([0-9]){3}/[0-9]{4}";
        if(Id.length()==12){
            if(Id.matches(regex)){
                System.out.println("Login success");
            }else{
                System.out.println("Incorrect Id!");
            }
        }else{
            System.out.println("Incorrect Id!");
        }
    }

}
