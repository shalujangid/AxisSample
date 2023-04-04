public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v= new ThreeWheeler();
        v.accelerate();
        v.drive();
        v.brake();
        v=new TwoWheeler();
        v.accelerate();
        v.drive();
        v.brake();
    }
}
