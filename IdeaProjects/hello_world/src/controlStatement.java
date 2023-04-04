public class controlStatement {
    public static void main(String[] args) {
        //if statement
        int a= 2;
        int b=6;
        if(a<b){
            System.out.println("a is less than b");
        }


        //else if
        if((a>b) && (a==2)){
            System.out.println("condition matches");
        }
        else {
            System.out.println("whole condition doesn't matches");
        }
        int c;



        //  if else ladder
        if((a>b)){
           c=a+b;
            System.out.println(c);
        }
        else if(a==5){
             c=a-b;
            System.out.println(c);
        }
        else if((a>b)||a==2){
            c=a*b;
            System.out.println(c);
        }
        else{
            System.out.println("else statement");
        }



        // nested if
        if(a<b){
           if(a==2){
               c= a+5;
               System.out.println(c);
           }
           else{
               System.out.println("a is not equal to 2");
           }
        }else{
            System.out.println("condition mismatched");
        }




    }
}
