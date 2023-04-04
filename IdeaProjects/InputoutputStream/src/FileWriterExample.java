import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("C:\\Users\\Public\\Documents\\demo.txt");
            fw.write("Hey there! Have a nice day!");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
