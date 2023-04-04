class VehicleDemo
{
    public static void main(String arg[])
    {
        Vehicle t1 =new Twowheeler("RJ14 1234", 1,2);
        t1.display();
        t1 = new Threewheeler("RJ45 5432", 4,3);
        t1.display();
        t1 =new Fourwheeler("RJ14 4567",5,"Sedan");
        t1.display();

    }
}