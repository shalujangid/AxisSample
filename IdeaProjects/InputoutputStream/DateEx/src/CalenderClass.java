import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderClass {

    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        Calendar c= Calendar.getInstance();
        System.out.println("Year: "+c.get(Calendar.YEAR));
        System.out.println("Year: "+c.get(Calendar.MONTH));
        System.out.println("Year: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Year: "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Year: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Year: "+c.get(Calendar.MINUTE));
        System.out.println("Year: "+c.get(Calendar.SECOND));
        System.out.println("Year: "+c.get(Calendar.MILLISECOND));
        System.out.println("Year: "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Year: "+c.get(Calendar.HOUR_OF_DAY));


        //Exercise 1 to get date after 2 weeks from current date
        int noOfDays = 14;
        Calendar cal = Calendar.getInstance();
        Date cdate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date d = cal.getTime();
        System.out.println("\nCurrent Date: " + cdate+"\n");
        System.out.println("Day after two weeks: " + d+"\n");

        //Exercise 2 to get experience

        Calendar doj = new GregorianCalendar(2018, 11, 9);
        Calendar calins = Calendar.getInstance();
        int years=calins.get(Calendar.YEAR) - doj.get(Calendar.YEAR);
        System.out.println("Total experience of employee is : " +years+" years");





    }
}
