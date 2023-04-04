import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Public\\Documents\\demo.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("hey there!");
            buffer.close();
            System.out.println("Success");
        }
        catch(Exception e){
            e.getStackTrace();
        }

    }
}
