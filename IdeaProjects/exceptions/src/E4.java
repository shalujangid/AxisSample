public class E4 {
    public static void main(String[] args) {
        try {
            int b=Integer.parseInt(args[0]);
            try{
                int x=5/0;
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("final block");
        }
    }
}
