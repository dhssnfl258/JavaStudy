package ver2_lec04;
//익명클래스
public class AnonyClassMainMethod {
    public static void main(String[] args) {

        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 이 구동중입니다.");
            }
        };
        action.run();
    }
}
