import java.util.Scanner;

public class UserInterfaceClass {
    static  double commission=0;
    public static CommissionInfo generateCommissionObtained=(Ticket t)->{
        if(t.getClassType().equalsIgnoreCase("SL") || t.getClassType().equalsIgnoreCase("2s") )
            commission += 60;
        if(t.getClassType().equalsIgnoreCase("1A") || t.getClassType().equalsIgnoreCase("2A") || t.getClassType().equalsIgnoreCase("3A")  )
            commission += 100;
        return commission;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int noOfP = sc.nextInt();
        Ticket ticket[] = new Ticket[noOfP];
        double amnt=0;
        for (int i = 0; i < noOfP; i++) {
            ticket[i] = new Ticket();
            System.out.println("Details of passenger " + i+1);
            System.out.println("Enter the pnr no: ");
            ticket[i].setPnrNo(sc.nextLong());
            sc.nextLine();
            System.out.println("Enter the passenger name:");
            ticket[i].setPassengerName(sc.nextLine());
            System.out.println("Enter the seat no: ");
            ticket[i].setSeatNo(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter the class type:");
            ticket[i].setClassType(sc.nextLine());
            System.out.println("Enter the ticket fare: ");
            ticket[i].setTicketFare(sc.nextDouble());
            amnt=generateCommissionObtained.calculateCommissionAmount(ticket[i]);
        }

        System.out.println("Total Commission calculated is "+amnt+" Rs.");





    }
}
