import java.util.*;
public class Library{
    private ArrayList<Book> bookList=new ArrayList<Book>();

    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> result=new ArrayList<Book>();
        for(Book b:bookList){
            if(b.getAuthor().equals(author)){
                result.add(b);
            }
        }
        return result;
    }
    public int countnoofbook(String bname){
        int count=0;
        for(Book b:bookList){
            if(b.getBookName().equals(bname))
                count++;
        }
        return count;
    }
}
