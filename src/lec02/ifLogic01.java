package lec02;

public class ifLogic01 {
    public static void main(String[] args) {
        for (int i = 0 ; i <5; i++){
            System.out.println(i);
        }
        int whileCnt = 0;

        do {
            System.out.println(whileCnt);
            whileCnt++;
        }while(whileCnt<3);
    }
}
