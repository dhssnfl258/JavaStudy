package zTheJava8;

import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {

        //익명 내부 클래스
        RunSomething runSomething2 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hoho");
            }
        };
        //Lambda express
        RunSomething runSomething = () -> {
            System.out.println("Hello");
            System.out.println("Lamda");
        };

        runSomething.doIt();
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        Function<Integer, Integer> plus11 = (i) -> i+11;
        System.out.println(plus11.apply(11));
        Function<Integer, Integer> multiply = (i) -> i*2;

        Function<Integer, Integer> multiplyAndPluse = plus11.compose(multiply);

        System.out.println(multiplyAndPluse.apply(10));

        int a = plus10.andThen(multiply).apply(2);
        System.out.println(a);

        Consumer<Integer> printT = (i) -> System.out.println(i);

        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;

        System.out.println(get10.get());

        Predicate<String> startsWithSeung = (s) -> s.startsWith("Seungjae");
        Predicate<Integer> isEven = (i) -> i%2 ==0;

        //입출력 타입 같은 경우
        UnaryOperator<Integer> seung = (i) -> i+1;

        BiFunction<Integer, Integer, Integer> sum = (k ,b) -> k + b;

        IntConsumer zea = System.out::println;

        zea.accept(10);



    }


}
