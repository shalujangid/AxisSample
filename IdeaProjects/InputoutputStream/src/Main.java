import java.io.*;

public class Main {
    public static void main(String[] args) {
       StringBuffer content=null;
        FileInputStream filestream=null;

        int ch;
        int count=0;
        int c=0;
        String line;
        int w = 0;
        try{
            filestream= new FileInputStream("C:\\Program Files\\docs\\newFile.txt");
            content=new StringBuffer();

            while((ch=filestream.read())!=-1){
                content.append((char) ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    count++;
                }
                if(ch==' '){
                    c++;
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
        finally {
            try{
                System.out.println(content);
                System.out.println("Total number of vowels in this file are " +count);
                System.out.println("Total number of spaces in this file are " +c);
                String s=new String(content);
                String words[] = s.split(" ");
                w = w + words.length;
                System.out.println("Total number of words in this file are " +words.length);
                filestream.close();
            }catch(IOException e3){
                e3.printStackTrace();
            }
        }
    }
}