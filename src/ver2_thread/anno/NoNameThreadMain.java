package ver2_thread.anno;

public class NoNameThreadMain {

    public static void main(String[] args) {
        System.out.println("thread method start");

        Thread threadOne = new Thread(){
            @Override
            public void run() {
                showPrint("threadOne", 1000);
            }
        };

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                showPrint("thread2", 300);
            }
        });

        threadOne.start();
        thread2.start();
        System.out.println("main methodend");
    }

    private  static void showPrint(String message, int interruptInterval){

        for( int i = 0 ; i < 3 ; i ++ ){
            try{
                Thread.sleep(interruptInterval);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}
