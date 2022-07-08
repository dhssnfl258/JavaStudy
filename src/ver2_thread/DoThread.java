package ver2_thread;

public class DoThread extends Thread{
    private String message;
    private int interuptInterval;

    public DoThread(String message, int interuptInterval){
        this.message = message;
        this.interuptInterval = interuptInterval;
    }

    @Override
    public void run() {
        for(int i = 0 ; i <3; i++){
            try{
                Thread.sleep(interuptInterval);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}
