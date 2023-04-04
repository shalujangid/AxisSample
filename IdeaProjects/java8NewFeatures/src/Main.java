public class Main implements AInterface {
    public static void main(String[] args) {
        AInterface.show();
        BInterface.show();
    }
      void show(){
       AInterface.show();
    }


}