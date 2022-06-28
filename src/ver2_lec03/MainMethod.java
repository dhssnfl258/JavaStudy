package ver2_lec03;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("메인메소드 실행.");
        ExtendsClass extendsClass = new ExtendsClass();
        extendsClass.methodSecond();
        int thirdResult = extendsClass.methodThird();
        System.out.println("세 번쨰 값입니다.:::" + thirdResult);



    }
}
