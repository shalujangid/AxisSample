class Fourwheeler extends Vehicle
{
    String car_type;
    Fourwheeler(String r,int m,String s)
    {
        super(r,m);
        this.car_type=s;
    }
    void display()
    {
        System.out.println("Four wheeler car");
        super.display();
        System.out.println("This car is a :" +car_type+" car");
        System.out.println();
    }
}