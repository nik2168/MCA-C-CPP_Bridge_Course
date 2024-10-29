import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


// Lockss are alternate for synchronization where sync in build in every class as implict type of lock

// locks are explict types that helps to manipulate locks according to our needs

// private final Lock lock = new ReentrantLock(){};


// with custom or explicit locks user Lock interface ...
class BankAccount{
   private  int balance = 100;
      ReentrantLock lock;  

   BankAccount(ReentrantLock lock){
    this.lock = lock;
   }
    
    //  @SuppressWarnings("static-access")
    public void withdraw (int amount){
            System.out.println(Thread.currentThread().getName()+ " " + amount + " withdrawn in progress !");
try {

        // lock.lock() == synchronize -> will wait until previous thread gets free
       if(lock.tryLock(4000, TimeUnit.MILLISECONDS)){ // lock.tryLock() will wait for 1000 ms and then check if lock is free else moveon
          if(amount <= balance){

            try {
                Thread.sleep(3000);
                            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " " + amount + " withdrawn successfully !" + " current balance :" + balance);
            } catch (InterruptedException e) {
                // e.printStackTrace();
                System.out.println("Thread interepted");
                Thread.currentThread().interrupt(); // will inform or restore the info that this thread was interepted;
            }finally{
                lock.unlock(); // finally once the try block is done we must unlock that thread.
            }

        }else{
            System.out.println(Thread.currentThread().getName() + " low balance !");
        }
     } else{
         // if a thread is already locked then other's will come here after checking for 1000 ms
System.out.println(Thread.currentThread().getName()+ " could not aquire the lock will try again later");
            }
} catch (Exception e) {
                    Thread.currentThread().interrupt(); // will inform or restore the info that this thread was interepted;
}                   // update the state of thread that its interepted;
     }
}

 // with Synchronization keyword - > implicit locks

// class BankAccount{
//    private  int balance = 100;

//      public synchronized void withdraw (int amount){

//         if(amount <= balance){

//             System.out.println(Thread.currentThread().getName()+ " " + amount + " withdrawn in progress !");
//             try {
//                 Thread.sleep(300);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             balance -= amount;
//             System.out.println(Thread.currentThread().getName()+ " " + amount + " withdrawn successfully !" + " current balance :" + balance);
//         }else{
//             System.out.println(Thread.currentThread().getName() + " low balance !");
//         }
//      }
// }





public class Locks {
    public static void main (String arg []){

            ReentrantLock lock = new ReentrantLock();  

        BankAccount acc = new BankAccount(lock);
        Runnable task = new Runnable() {
            public void run(){
                acc.withdraw(50);
            }
        };
     Thread t1 = new Thread(task);
     Thread t2 = new Thread(task);
     t1.start();
     t2.start();         
     

    }
}
