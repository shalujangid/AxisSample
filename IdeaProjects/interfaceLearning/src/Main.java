public class Main {
    public static void main(String[] args) {

       circle c= new circle(4.5f);
       System.out.println("Area of circle is "+ c.area());
        System.out.println("Perimeter of circle is "+ c.perimeter());

        square s= new square(4.5f);
        System.out.println("Area of square is "+ s.area());
        System.out.println("Perimeter of square is "+ s.perimeter());



    }
}