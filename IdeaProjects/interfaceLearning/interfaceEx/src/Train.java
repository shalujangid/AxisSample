public class Train implements IVehicle , IPublicTransport{

    int no_of_people;

    @Override
    public void getNumberOfPeople() {
      System.out.println("The number of people are "+no_of_people);
    }

    @Override
    public void drive() {
        System.out.println("The train is in driving mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("The train is turning left");
    }

    @Override
    public void brake() {
        System.out.println("The train is in brake mode");
    }
}
