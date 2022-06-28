package lec07.jth.world.main;

import lec07.jth.world.vo.chemical.Hcc;

public class MainMethod {
    public static void main(String[] args) {
        //기업정보 셋팅
        //한화솔루션 케미칼
        Hcc hcc = Hcc.getInstance();
        String hccName = String.valueOf("한화솔루션 케미칼");
        String hccCompanyProperty = String.valueOf("화학");
        String hccHeadOfficeAddress = String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
        int hccTotalEmployee         =  5730;
        int hccSalesAmount           =  34493;
        int hccPropertyAmount        = 32289;
        int hccDebtAmount            = 32289;

        hcc.setCompanyname(hccName);
        System.out.println(hcc.toString());
    }
}
