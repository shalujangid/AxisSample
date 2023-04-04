import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String str=sc.nextLine();
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Public\\Documents\\demo.txt");
            byte b[]=new byte[1000];
            b =str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e)
            {System.out.println(e);
        }
    }
}
