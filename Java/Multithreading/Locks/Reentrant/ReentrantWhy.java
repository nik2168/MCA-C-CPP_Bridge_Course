import java.util.concurrent.locks.*;





public class ReentrantWhy{

    ReentrantLock lock;

    ReentrantWhy(ReentrantLock lock){
        this.lock = lock;
    }

    // here we are calling outer Method first and it locks the lock
    // after that it calls inner method which will again lock the lock 
    // and reentrant class handles the relock functionality to prevent error
    // kind of unlock in same way -> lock lock unlock unlock 

    // this example creats a deadlock situation which is handled by reentrant lock;
    public void outerMethod() {
        //  lock.lockInterruptibly();  -> to make the current thread interruptable ...
        lock.lock();          
     try {
        Thread.sleep(3000);
            System.out.println("Outer Method");
            innerMethod(); 
        } catch (Exception e) {
            
        }finally{
lock.unlock(); // after inner lock its unlock outer lock
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method");
        } catch (Exception e) {

        }finally{
lock.unlock(); // first unlock this inner lock
        }
    }

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        ReentrantWhy t = new ReentrantWhy(lock);

 

        // t.innerMethod();
        t.outerMethod();
        
    }
}