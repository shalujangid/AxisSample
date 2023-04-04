public class MainEmp {
        public static void main(String[] args) throws InvalidAgeException {

            Employee r =new RegularEmp();
            Employee r1 = new PartTimeEmp();
            try {
                r.showDetails();
                r1.showDetails();
                RegularEmp p1 = (RegularEmp) new Employee();
                p1.Employee(25);
            }
            catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
            catch (ClassCastException e)
            {
                System.out.println(e.getMessage());
            }

        }
}
