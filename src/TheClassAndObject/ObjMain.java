package TheClassAndObject;

public class ObjMain {

    public static void main(String[] args) {
        //class use
        Car car = new Car("b","k");
        car.type = "suv";
        car.name = "benz";
        car.PrintCarInfo();
        car.move();
        car.break1();
        car.PrintCarInfo(3);
    }
        Zoo zoo = new Zoo("lion", 10d, "animal");

}
