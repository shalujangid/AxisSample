public class car extends MotorisedVehicle implements IVehicle{

    @Override
    public void drive() {
        System.out.println("The car is in driving mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("The car is turning left");
    }

    @Override
    public void brake() {
        System.out.println("The car is in brake mode");
    }
}
