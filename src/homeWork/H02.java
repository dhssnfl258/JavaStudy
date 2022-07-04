package homeWork;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        double cashBack = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int  money = in.nextInt();
        cashBack = money * 0.1;
        if(cashBack > 300){
            cashBack = 300;
        }
        System.out.println("결제 금액은 " + money + "원이고, 캐시백은 "+ (int)cashBack + "원 입니다.");
//        System.out.println("캐시백은" + (int)cashBack + "원");



    }
}
