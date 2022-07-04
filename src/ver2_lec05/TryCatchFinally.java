package ver2_lec05;

public class TryCatchFinally {
    public static void main(String[] args) {

//        try{
//            System.out.println("try-catch-finally 구문이 실행되었습니다.");
//
//            int allSum = 10/0;
//        } catch (Exception e) {
//            System.out.println("예외발생");
//        } finally {
//            System.out.println("try-catch-finally 구문이 종료되엇습니다.");
//        }
        try{
            System.out.println("업무 로직입니다.");
        }catch (Exception e){
            System.out.println("예외발생");
        }finally {
            System.out.println("마지막 위치입니다.");
        }
    }
}
