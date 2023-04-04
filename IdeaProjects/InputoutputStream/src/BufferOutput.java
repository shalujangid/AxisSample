import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter employee Id");
        int Id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name");
        String name=sc.nextLine();
        String str="Welcome "+name+". Your Employee Id is :"+Id;
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Public\\Documents\\demo.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            bout.write(str.getBytes());
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
