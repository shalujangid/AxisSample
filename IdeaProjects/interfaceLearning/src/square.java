public class square implements Shape{
    float side;

    square(float s){
        this.side=s;
    }


    @Override
    public float area() {
        float areacal =side*side ;
        return areacal;
    }

    @Override
    public float perimeter() {
        float peri = 4*side;
        return peri;
    }
}
