public class Counter implements Runnable{
    Storage st;
    int count;
    public Counter(int count)
    {
       this.count=count;
    }
    @Override
    public void run()
    {
        for(int i = 0 ; i < count; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " +i);
            st.setValue(i);

        }

    }
    public static void main(String[] args){
        Counter c1 = new Counter(10);
        Thread t1=new Thread(c1);
        t1.start();
        Printer p1 = new Printer(10);
        Thread t2=new Thread(p1);
        t2.run();

    }
}
//
// Implement three classes: Storage, Counter, and Printer.
// The Storage class should store an integer.
// The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and stores each value
// in the Storage class.
// The Printer class should create a thread that keeps reading the value in the Storage class and printing it.
// Write a program that creates an instance of the Storage class and sets up a Counter and a
// Printer object to operate on it.
