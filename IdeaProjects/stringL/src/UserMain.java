
import java.util.Scanner;
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
