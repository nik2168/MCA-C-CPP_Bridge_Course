package threads;

public class WorldImplement implements Runnable {

    @Override
    public void run() {
        int j = 0;
              for(int i = 0; i < 500000; i++){
                j += i;
       }
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
