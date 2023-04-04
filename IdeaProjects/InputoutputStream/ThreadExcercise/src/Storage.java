public class Storage {
    int  i;
    public synchronized void setValue(int i)
    {
        this.i = i;
    }
    public synchronized int getValue()
    {
        return this.i;
    }

}
