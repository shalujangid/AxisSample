public class E5 {

    public static void main(String[] args) throws Exception {
        try{
            String x=null;

            System.out.println(x.substring(2));

        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest statements");
    }
}
