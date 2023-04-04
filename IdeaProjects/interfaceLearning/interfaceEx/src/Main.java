public class Main {
    public static void main(String[] args) {
        car c= new car();
        c.drive();
        c.brake();
        c.checkMotor();
        c.turnLeft();


        Train t= new Train();
        t.getNumberOfPeople();
        t.brake();
        t.drive();
        t.turnLeft();


//        IVehicle i=new car();
//        i.brake();
//        i.turnLeft();
//        i.drive();
//        car c= new car();
//        c.checkMotor();
//
//        i= new Train();
//        i.brake();
//        i.drive();
//        i.turnLeft();
//        Train t=new Train();
//        t.setNo_of_people(24);
//        t.getNumberOfPeople();

    }
}