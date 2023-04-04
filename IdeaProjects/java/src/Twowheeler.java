class Twowheeler extends Vehicle
{
    int no_of_wheel;
    Twowheeler(String r,int m,int n)
    {
        super(r,m);
        no_of_wheel=n;
    }
    void display()
    {
        System.out.println("Two wheeler activa");
        super.display();
        System.out.println("No. of wheel : " +no_of_wheel);
        System.out.println();
    }
}