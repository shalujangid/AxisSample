import java.io.*;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try{
            Employee e1=new Employee(40000,"john",24);
            System.out.println("The employee data before serialization\n"+e1 );
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Public\\Documents\\demo.txt");
            ObjectOutputStream bout=new ObjectOutputStream(fout);
            bout.writeObject(e1);
            bout.flush();
            bout.close();
            System.out.println("success");
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        try{
            Employee emp;
            FileInputStream fin=new FileInputStream("C:\\Users\\Public\\Documents\\demo.txt");
            ObjectInputStream iout=new ObjectInputStream(fin);
            emp=(Employee) iout.readObject();
            iout.close();
            System.out.println("Employee after deserialization\n"+emp);
        }
        catch(IOException excep)
        {
            excep.printStackTrace();
        }
        catch(ClassNotFoundException e2)
        {
            e2.printStackTrace();
        }
    }
}
