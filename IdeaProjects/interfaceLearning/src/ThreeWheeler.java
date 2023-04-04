public class ThreeWheeler implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving three wheeler..");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating ");
    }

    @Override
    public void brake() {
        System.out.println("brake applied");
    }
}
