package lec05;

public class SamsungElectronics extends Electronics {
    //부모클래스의 인스턴스 사용가능해진다.

    int productsCount = 0;

    public void showCount(){
        System.out.println("show value :::" + productsCount);
        System.out.println("super.show value :::" + super.productsCount);
    }
}
