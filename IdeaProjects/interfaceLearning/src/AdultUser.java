public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public void setAge(int age) {
        this.age = age;
    }


    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(this.age>12){
            System.out.println("You have successfully registered under a adult account");
        }
        else{
            System.out.println("Sorry! Age must be greater than 12 to register as adult");

        }
    }

    @Override
    public void requestBook() {
        if(this.bookType=="Fiction"){
            System.out.println("Book issued successfully! Please return the book within the 7 days");
        }else {
            System.out.println("Oops! You are allowed to take only adult fiction books");
        }
    }
}
