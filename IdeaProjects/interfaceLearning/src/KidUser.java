public class KidUser implements LibraryUser{
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
        if(this.age<12){
            System.out.println("You have successfully registered under a kid account");
        }
        else{
            System.out.println("Sorry! Age must be less than 12 to register as kid");

        }

    }

    @Override
    public void requestBook() {

        if(this.bookType=="kids"){
            System.out.println("Book issued successfully! Please return the book within the 10 days");
        }else {
            System.out.println("Oops! You are allowed to take only kids books");
        }
    }
}
