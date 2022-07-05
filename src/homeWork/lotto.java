package homeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        int lotto[] = new int [6];
        char index = 'A';
        Scanner in = new Scanner(System.in);

        // 번호 생성
        for(int i=0; i<6; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;

            // 중복 번호 제거
            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        String[][] myLottoArray =  new String[10][];
        String[] myLotto = new String[10];
        int[] count = new int[10]; // 맞춘 갯수 count

        System.out.println("[로또 땅첨 프로그램]\n");
        System.out.print("로또 갯수를 입력해 주세요(1~10숫자):::");
        int idx = in.nextInt();
        for(int i = 0 ; i < idx ; i++){
            System.out.print(index+ "   ");
            myLotto[i] = in.next();
            myLottoArray[i] =  myLotto[i].split(",");
            index +=1;
        }
        index ='A';
        System.out.println("[로또 발표]");
        // 번호 출력
        for(int i=0; i<6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println("\n");
        System.out.println("[내 로또 결과]");
        for(int i=0; i<idx; i++){
            for(int j = 0; j<6; j++){
                if(Integer.parseInt(myLottoArray[i][i]) == lotto[i]){
                    count[i] ++;
                }
            }
            System.out.println(index+ "   " + myLotto[i] + " => " + count[i]+ "개 일치.");
            index +=1;
        }
    }
}
