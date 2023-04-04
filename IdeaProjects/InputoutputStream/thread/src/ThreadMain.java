public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadsDemo t=new ThreadsDemo();
        t.start();
        ThreadDemo2 t2=new ThreadDemo2();
        t2.run();
        t.join();
        System.out.println("main ends here");
    }
}
