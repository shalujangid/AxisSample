public class triangle {
    float d1;
    float d2;
    float d3;
    float d4;

    triangle(){

    }
    triangle(float b,float h){
        d1=b;
        d4=h;
    }
    triangle(float s1,float s2,float s3,float h){
        d1=s1;
        d2=s2;
        d3=s3;
        d4=h;
    }

    public float getPerimeter(){
        float perimeter;
        perimeter= d1+d2+d3;
        return perimeter;
    }

    public float getArea(float d1,float d2){
        float area;
        float i = d1 * d2;
        area= (0.5f)*i;
        return area;
    }

    public float getArea(float d1,float d2,float d3){
        float area=0;

//       float s=(d1+d2+d3)/2.0f;
//        area=s(s-d1)(s-d2)(s-d3);
       return area;
    }

    public static void main(String[] args) {
            triangle t1=new triangle(7.8f,5,6,5);
            System.out.println("Perimeter of triangle is "+t1.getPerimeter());
            System.out.println("Area of triangle is "+t1.getArea(3,6));
        System.out.println("Area of triangle is "+t1.getArea(3,6,5));
    }
}
