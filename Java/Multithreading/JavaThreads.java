import threads.World;
import threads.WorldImplement;

public class JavaThreads{

    // we have main thread by default which executes our main function
    public static void main(String[] args) {
     

        World a = new World(); // new thread using Thread Class

        WorldImplement b = new WorldImplement(); // new thread using runnable interface

        Thread c = new Thread(b);

        System.out.println(a.getName());
        System.out.println(c.getName());

       c.start();
        System.out.println(c.getState()); // prints the current state of thread new, runnable, running, blocked/waiting, terminated

        // a.start();
        // c.start();
        // for(int i = 0; i < 500000; i++){
        //    System.out.println("Main - 1");
        // }
    }
}