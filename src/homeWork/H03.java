package homeWork;

import java.util.Scanner;
public class H03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = in.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int inStageTime = in.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        char comm  = in.next().charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        char card = in.next().charAt(0);

        char vv = 'y';
        int Cost = 0;
        if(age >= 3){
            Cost = 10000;
            if( comm == 'y' || card == 'y'){
                Cost = 8000;
            }
            else if (age < 13 || inStageTime >17){
                Cost = 4000;
            }
        }
        System.out.println("입장료: "+ Cost);
    }
}
