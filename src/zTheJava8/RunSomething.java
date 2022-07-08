package zTheJava8;


@FunctionalInterface
public interface RunSomething {
    //함수형 인터페이스
    //추상 메소드가 한개만 있는것.
    //두개가있다? 함수형 인터페이스x
    //다른 인터페이스는 존재해도 괜찮다.
    //static public 생략 가능(인터페이스 구현시)
    void doIt();
//    void doAgain();

//    static void printName(){
//        System.out.println("seungjae");
//    }
//
//    default void printAge(){
//        System.out.println("27");
//    }
}
