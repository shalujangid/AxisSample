public class rectangle {
    float length;
    float breadth;
    public float getPerimeter(){
        float perimeter;
        perimeter= 2*(length+breadth);
        return perimeter;

    }
    rectangle(float l,float b){
        length=l;
        breadth=b;
    }
    public float getArea(){
        float area;
        area= length*breadth;
        return area;
    }
    public static void main(String[] args) {
        rectangle r=new rectangle(2,3);
        System.out.println( r.getArea());
        System.out.println(r.getPerimeter());
        r.getPerimeter();
    }
}
