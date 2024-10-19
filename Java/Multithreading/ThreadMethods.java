public class ThreadMethods extends Thread {

    public ThreadMethods(String name){
        super(name);
    }

public void run (){
    System.out.println("Thread is exicuting or running ...");
    for(int i = 0; i < 400; i++){
        System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority() + " - " + i);
        // try {
        //     Thread.sleep(100); // wait for 3 sec for anything
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // Thread.yield(); // will gives hind to give chance to another thread
    }
}

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods a = new ThreadMethods("First"); // these are normal threads -> user threads also
        ThreadMethods b = new ThreadMethods("Second");
        a.setPriority(Thread.MIN_PRIORITY); // we can get exact priority base when our device has single core in it, concurrence vs parallel
        // a.interrupt(); // clear sleep interval for any thread instantly ....
        // b.start();
        // a.join(); // wait until thread "a" finnishes its execution ...

        a.setDaemon(true); // daemon threats are wild threads which will be ignored by jvm 
        a.start();
        System.out.println("After 3 secs"); // main thread executes this first

    }
}
