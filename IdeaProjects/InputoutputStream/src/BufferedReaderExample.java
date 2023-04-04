import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Users\\Public\\Documents\\demo.txt");
            BufferedReader buf = new BufferedReader(file);
            String line=null;
            System.out.println("The data which is taken to file to the buffer is");
            while((line=buf.readLine())!=null){
                System.out.println(line);
            }

            //to reverse the content of file
            List<String> tmp = new ArrayList<String>();
            do{
                line = buf.readLine();
                tmp.add(line);
            }while(line!=null);
            for(int i=tmp.size()-1;i>=0;i--) {
                System.out.println(tmp.get(i));
            }

        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
