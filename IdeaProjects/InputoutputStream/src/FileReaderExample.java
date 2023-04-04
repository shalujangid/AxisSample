import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {


        try{
            FileReader fr=new FileReader("C:\\Users\\Public\\Documents\\demo.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }

    }
}
