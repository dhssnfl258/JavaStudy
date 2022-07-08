package ver2_thread;

public class ThreadExerMain {

    //thread
    //runnableinterface thread 차이

    public static void main(String[] args) {
        System.out.println("메인 함수 실행");

        Thread thread1 = new DoThread("alpha", 1000);
        Thread thread2 = new DoThread( "bravo", 700);

        Thread thread3 = new Thread(new DoRunnable("beta",300));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("메인함수 종료");
    }
}
