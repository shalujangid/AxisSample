import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Library lib=new Library();
        int i,choiceIs;

        System.out.println("1.Add Book");
        System.out.println("2.Display all book details");
        System.out.println("3.Search Book by author");
        System.out.println("4.Count number of books - by book name");
        System.out.println("5.Exit");

        for(i=0;i<10;i++)
        {
            System.out.println("Enter your choice:");
            choiceIs=s.nextInt();
            s.nextLine();
            if(choiceIs==1){
                Book b=new Book();
                System.out.println("Enter the isbn no. :");
                b.setIsbnno(s.nextInt());s.nextLine();
                System.out.println("Enter the book name :");
                b.setBookName(s.nextLine());
                System.out.println("Enter the author name :");
                b.setAuthor(s.nextLine());
                lib.addBook(b);
            }
            if(choiceIs==2)
            {
                ArrayList<Book> result=lib.viewAllBooks();
                if(result.isEmpty())
                {
                    System.out.println("The list is empty.");
                    continue;
                }
                for(Book b:result)
                {
                    System.out.println("Isbn No: "+b.getIsbnno());
                    System.out.println("Book name:"+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(choiceIs==3)
            {
                System.out.println("Enter the author name:");
                String name=s.nextLine();
                ArrayList<Book> result=lib.viewBooksByAuthor(name);
                if(result.isEmpty()){
                    System.out.println("None of the book published by the author "+name);
                    continue;
                }
                for(Book b:result)
                {
                    System.out.println("Isbn no: "+b.getIsbnno());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(choiceIs==4)
            {
                System.out.println("Enter the book name");
                String name=s.nextLine();
                System.out.println("The count is "+lib.countnoofbook(name));
            }
            if(choiceIs==5)
                System.exit(0);
        }
    }
}
