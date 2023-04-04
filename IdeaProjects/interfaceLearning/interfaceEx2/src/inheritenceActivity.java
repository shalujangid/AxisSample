public class inheritenceActivity {
    public static void main(String[] args) {

        Employee m =new Manager(126534,"Peter","Chennai India",237844,65000);
        m.calculateSalary();
        m.calculateTransportAllowance();

        m=new Trainee(29846,"Jack","Mumbai India",442085,45000);
        m.calculateSalary();
        m.calculateTransportAllowance();
    }
}
