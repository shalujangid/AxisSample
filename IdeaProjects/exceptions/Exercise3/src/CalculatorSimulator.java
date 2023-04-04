public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator t= new TaxCalculator();
        try{
            System.out.println("The tax amount is :"+ t.calculateTax("john",true,90000));
        }catch(CountryNotValidException e){
            System.out.println("The employee should be indian citizen to calculate tax");
        }
        catch(EmployeeNameInvalidException e1){
            System.out.println("The employee name cannot be empty");
        }
        catch(TaxNotEligibleException e2){
            System.out.println("The employee does not need to pay tax");
        }


    }
}
