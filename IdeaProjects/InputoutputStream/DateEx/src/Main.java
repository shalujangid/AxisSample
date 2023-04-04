
import java.text.*;
import java.time.*;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Main {
    //Date usage here
    public static void main(String[] args) throws ParseException {
        //curr date
        Date d1 = new Date();
        System.out.println("Current date is " + d1);

        Date d2 = new Date(2000, 11, 21);
        System.out.println("Date represented is "+ d2 );

        Date dt1 = new Date(2017, 3, 31);
        Date dt2 = new Date(2017, 5, 14);

        //before
        boolean result = dt1.before(dt2);
        System.out.println("Date1 is after date2: " + result);

        //after
        result = dt2.after(dt1);
        System.out.println("Date2 is after date1: " + result);

        //settime
        dt1.setTime(100);
        System.out.println("Date after the setting the time is: " + dt1);

        //setMonth
        dt2.setMonth(04);
        System.out.println("The dt2 Date is: " + dt2);

        //toString
        System.out.println("The original Date is: " + dt1.toString());

        //compareTo
        System.out.println("Comparing " + dt1.compareTo(dt2));
        //getDay
        System.out.println("Get Day " + dt1.getDay());
        //getHours
        System.out.println("Get Hours " + dt1.getHours());
        //getTime
        System.out.println("Get Time " + dt1.getTime());

//        Employee e1=new Employee(40000,"john",dt1,dt2);
//        System.out.println(e1);
//        Date empAge=e1.getDob();
//        int a=empAge.getYear();
//        System.out.println(a);

//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat DateFormat = new SimpleDateFormat(pattern);
//        String new_date = DateFormat.format(e1.getDoj());
//        System.out.println("Formatted Date: "+e1.getDoj()+" to " + new_date);


        String s;
        Date date=new Date();
        Format  formatter ;
        formatter=new SimpleDateFormat("G EEE yyyy/MM/dd HH:mm:ss");
        s=formatter.format(date);
        System.out.println(s);
        formatter=new SimpleDateFormat("hh:mm:ss yyyy/MM/dd");
        s=formatter.format(date);
        System.out.println(s);
        formatter=new SimpleDateFormat("EEEE, dd MMMM YYYY HH:mm:ss");
        s=formatter.format(date);
        System.out.println(s);
        formatter=new SimpleDateFormat("E, dd MMM YYYY HH:mm:ss z");
        s=formatter.format(date);
        System.out.println(s);



        DateFormat df;
        df=DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println(df.format(date));
        df=DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        System.out.println(df.format(date));
        df=DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        System.out.println(df.format(date));


        //StringToDate
        int daydate=01;
        int month=01;
        int year=2015;
        String in=daydate+"/"+month+"/"+year;
        SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
        Date theDate;
        theDate = sf.parse(in);
        System.out.println("Date parsed = "+sf.format(theDate));

    }
}