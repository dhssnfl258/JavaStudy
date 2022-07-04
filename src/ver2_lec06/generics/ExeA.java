package ver2_lec06.generics;

public class ExeA<T> {
// 제네릭. 특정타입을 정의하는것
    private T t; //임의의 타입 , 변수

    public ExeA(T t){
        this.t = t;

    }

    public T  getT() {
        return t;
    }

}
