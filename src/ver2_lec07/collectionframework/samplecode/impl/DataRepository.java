package ver2_lec07.collectionframework.samplecode.impl;

import ver2_lec07.collectionframework.ArrayList1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DataRepository {
    //가상의 데이터베이스
    //싱글톤 패턴
    private static DataRepository instance = new DataRepository();

    public static DataRepository getInstance(){
        return instance;
    }

    public LinkedHashMap<String, Object> saveDataLkMap = null;
    public ArrayList<String> saveDataArrList = null;

    private DataRepository(){

        System.out.println("DataRepository 생성자.");

        saveDataLkMap = new LinkedHashMap<String, Object>();
        saveDataArrList = new ArrayList<String>( );

        saveDataLkMap.put("국가1","한국");
        saveDataLkMap.put("국가2","미국");
        saveDataLkMap.put("국가3","중국");
        saveDataLkMap.put("국가4","일본");
        saveDataLkMap.put("국가5","러시아");

        saveDataArrList.add("전자");
        saveDataArrList.add("자동차");
        saveDataArrList.add("조선");
        saveDataArrList.add("IT");
        saveDataArrList.add("디스플레이");
        saveDataArrList.add("건설");
        saveDataArrList.add("에너지");

    }
}
