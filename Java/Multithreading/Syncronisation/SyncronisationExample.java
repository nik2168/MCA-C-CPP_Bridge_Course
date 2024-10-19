

 class Counter{
    private int counter;
    
   // by using synchronized keyword only one thread can access it at a time
   // critical section & race condition can be solved by this ...
   // also called mutual exclusion to make sure mulitple thread ain't able to access same object or variable at same time
   public synchronized void incCounter(){
    // synchronized(this){       // -> we can use to sync only a particular block in a function
    //     counter++;
    // }
             counter++;
    }

    public int getCounter(){
          return counter; 
         }
}

class MyThread extends Thread{
    
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

   public void run(){
         for(int i = 0; i < 1000; i++){
            counter.incCounter();
         }
    }

}

// hmmm hmmm hmm code explaination :-
// here we have a counter class with inc and getValue func
// we passed it in both of the threads
// as both threads accessing same object/resource concurrently
// it might cause conflicts in the value inc func
// will gets random increaments 1000 - 2000 on each iteration

// we can use synchronized keyword to make sure that only thread can use it at a time

public class SyncronisationExample {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        MyThread a = new MyThread(c);
        MyThread b = new MyThread(c);

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(c.getCounter());

    }
}
