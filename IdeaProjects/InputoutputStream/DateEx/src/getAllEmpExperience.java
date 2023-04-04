import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class getAllEmpExperience  {
    public void getExperience(Employee employee){
        List<String> s1=new ArrayList<String>();
        SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
        EmployeeObj obj=new EmployeeObj();
        int MaxExp=0;
        String name="";
        for(int j=0;j< obj.s.length;j++)
        {
            LocalDate d=obj.s[j].getDoj();
            int daydate= d.getDayOfMonth();
            int month=d.getMonthValue();
            int year=d.getYear();
            Calendar doj = new GregorianCalendar(year,month,daydate);
            Calendar calins = Calendar.getInstance();
            int years=calins.get(Calendar.YEAR) - doj.get(Calendar.YEAR);
//            int months=calins.get(Calendar.MONTH) - doj.get(Calendar.MONTH);
//            int days=calins.get(Calendar.DAY_OF_MONTH) - doj.get(Calendar.DAY_OF_MONTH);
            s1.add("Total experience of "+obj.s[j].getName()+" is : "+years+" years");
            if(years>MaxExp){
                MaxExp=years;
                name=obj.s[j].getName();
            }
        }
        System.out.println(s1);
        System.out.println(name+" has "+MaxExp+" years of experience which is maximum among all");
    }

    public static void main(String[] args) throws ParseException {
        Employee e=new Employee();
        getAllEmpExperience obj=new getAllEmpExperience();

        //to print object array from other class
//        EmployeeObj obj=new EmployeeObj();
//        for(int j=0;j< obj.s.length;j++){
//            System.out.println(obj.s[j]);
//        }
        // ends here

        EmployeeObj eoj=new EmployeeObj();
//        eoj.getEmpData();
        obj.getExperience(e);


    }
}
