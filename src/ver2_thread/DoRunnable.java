package ver2_thread;

public class DoRunnable implements Runnable {

    private String message;
    private int interruptInteval;

    public DoRunnable(String message, int interruptInterval) {
        this.message = message;
        this.interruptInteval = interruptInterval;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<3; i++){
            try{
                Thread.sleep(interruptInteval);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(message);
        }

    }
}
