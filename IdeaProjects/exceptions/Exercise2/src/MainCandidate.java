import java.util.Scanner;

public class MainCandidate {
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Candidate c = new Candidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate details");
        System.out.println("Name");
        c.setName(sc.nextLine());
        System.out.println("Gender");
        c.setGender(sc.nextLine());
        System.out.println("Expected Salary");
        double expsal = sc.nextDouble();
        if(expsal<10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        c.setExpectedSalary(expsal);
        return c;
    }

    public static void main (String[] args) {
        try{
            MainCandidate c = new MainCandidate();
            System.out.println(c.getCandidateDetails());
            if(c != null){
                System.out.println("Registration Successful");
            }
        }
        catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
