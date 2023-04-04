public class Test {
    int a,b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void alterPremitives(int x,int y){
        x=60;
        y=30;
    }
    void alterObject(Test t){
        t.a=25;
        t.b=62;
    }
}
