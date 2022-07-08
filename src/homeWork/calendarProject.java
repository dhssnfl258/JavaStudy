package homeWork;

import java.util.Calendar;
import java.util.Scanner;

public class calendarProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Calendar 클래스 기반 인스턴스 생성
        Calendar cal = Calendar.getInstance();

        System.out.println("[달력 출력 프로그램]");
        System.out.print("연도를 입력하세요.(yyyy):::");
        int year = in.nextInt();

        System.out.print("월을 입력하세요.(mm):::");
        int month = in.nextInt();
        if(month>12){
            System.out.print("잘못 입력했습니다. 다시 입력해 주세요. :::");
            month = in.nextInt();
        }


        System.out.println("\n[" + year + "년" + month + "월]");
        System.out.println("     Su     Mo     Tu     We     Th     Fr     Sa");

        //Calender Month는 0 ~ 11 return
        //희망연, 월, 일 선택
        cal.set(year, month-1, 1);
        //해당 월의 마지막 날짜
        int lastofDate = cal.getActualMaximum(Calendar.DATE);

        //첫날의 요일을 찾는다.
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.print("     ");
        for(int i = 1; i<week; i++){
            System.out.print("       ");
        }
        //날짜 출력

        for(int i = 1; i <= lastofDate; i++){
            System.out.print((i<2) ? String.format("%02d", i): "     "+String.format("%02d", i));

            if(week%7 == 0){
                System.out.println();
            }
            week++;
        }


    }
}
