public class TwoWheeler implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating");
    }

    @Override
    public void brake() {
        System.out.println("brake applied");
    }
}
