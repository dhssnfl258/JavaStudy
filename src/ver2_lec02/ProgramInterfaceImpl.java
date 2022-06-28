package ver2_lec02;

public class ProgramInterfaceImpl implements  ProgramInterface{


    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down");
    }
}
