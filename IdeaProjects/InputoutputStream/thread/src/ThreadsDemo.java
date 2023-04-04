public class ThreadsDemo extends Thread{
    public void run(){
       for(int i=0;i<20;i++){

           System.out.println(Thread.currentThread().getName()+" "+i);
           try{
               Thread.sleep(100);
           }catch(InterruptedException e){
                e.getStackTrace();
           }
       }
    }
}
