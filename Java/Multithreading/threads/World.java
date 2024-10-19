package threads;

public class World extends Thread {
    
    @Override   // to denote that we are overiding the run method of Thread class
    public void run(){
       for(int i = 0; i < 500000; i++){
        System.out.println("Hello");
       }
    }
}
