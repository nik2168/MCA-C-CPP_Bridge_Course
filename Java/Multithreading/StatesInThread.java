    class MyThread extends Thread{
         
         public void run(){
                System.out.println("Running Now ..."); 
                try {
                    Thread.sleep(6000); // wait for 6s // here the thread is a, explicit thread not the main thread 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }


public class StatesInThread {
    // this program demonstrate the main thread which used by java by default to execute main thread !

    public static void main(String[] args) throws InterruptedException {
        MyThread a = new MyThread();
      System.out.println(a.getState());
        a.start();
      System.out.println(a.getState());
      Thread.sleep(3000); // wait for 3 sec
       System.out.println(Thread.currentThread().getState());
       System.out.println(a.getState());
       a.join(); // wait until thread 'a' completes its execution and then terminated ...
       System.out.println(a.getState());
    }
}
