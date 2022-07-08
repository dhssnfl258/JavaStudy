package TheClassAndObject;

public class Car {
    String name;
    String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void PrintCarInfo() {
        System.out.println("===CarInfo===");

        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("move!");
    }
    public void break1(){
        System.out.println("break");
    }

    //오버로딩 구현
    public  void PrintCarInfo(int number){
        this.PrintCarInfo();
        System.out.println("CarNum:" + number);
    }
    public  void PrintCarInfo(String date){
        this.PrintCarInfo();
        System.out.println("date:" + date);
    }
    public  void PrintCarInfo(String date, int number){
        this.PrintCarInfo();
        System.out.println("date:" + date + ", num: " + number);
    }


}
