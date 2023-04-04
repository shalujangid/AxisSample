public class Printer implements Runnable{
    private int storage;
    Storage st=new Storage();
    public Printer(int storage)
    {
        this.storage = storage;
    }
    @Override
    public void run()
    {
        for(int i = 0 ; i < storage; i++)
        System.out.println(Thread.currentThread().getName() + " " +st.getValue());
    }
}
