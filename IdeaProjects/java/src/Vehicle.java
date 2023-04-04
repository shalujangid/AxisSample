public class Vehicle {
    String regno;
    int model;
    Vehicle(String r, int m)
    {
        regno=r;
        model=m;
    }
    void display()
    {
        System.out.println("Registration no: "+regno);
        System.out.println("Model no: "+model);
    }
}
