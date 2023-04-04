class Threewheeler extends Vehicle
{
    int noofleaf;
    Threewheeler(String r,int m,int n)
    {
        super(r,m);
    }
    void display()
    {
        System.out.println("Three wheeler auto");
        super.display();
        System.out.println();
    }
}