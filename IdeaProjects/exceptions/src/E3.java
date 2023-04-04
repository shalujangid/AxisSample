public class E3 {
    public static void main(String[] args) {
        try{
            int b=Integer.parseInt(args[0]);
            try{
                int x=5/b;
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }
        finally {
            System.out.println("final block");
        }

        System.out.println("Rest statements");
    }
}
