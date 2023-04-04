public class circle implements Shape{
    float radius;
    static final float pi=3.14f;
    circle(float r){
        this.radius=r;
    }


    @Override
    public float area() {
        float areacal = (float) ( pi * radius * radius);
        return areacal;
    }

    @Override
    public float perimeter() {
        float peri = (float) (pi * 2 * radius);
        return peri;
    }
}
