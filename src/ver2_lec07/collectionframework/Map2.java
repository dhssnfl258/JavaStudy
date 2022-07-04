package ver2_lec07.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map2 {
    public static void main(String[] args) {
        //Map
        //HashMap
        //순서에 상관없이 들어간다.
        //Map Set 차이점은?
        //Hash Map이란?

        HashMap hashMap = new HashMap();
        hashMap.put("국가1", "한국");
        hashMap.put("국가2", "중국");
        hashMap.put("국가3", "미국");
        hashMap.put("국가4", "러시아");
        hashMap.put("국가5", "일본");

        System.out.println(hashMap.toString());

        LinkedHashMap lkMap = new LinkedHashMap();
        lkMap.put("국가1", "한국");
        lkMap.put("국가2", "일본");
        lkMap.put("국가3", "러시아");
        lkMap.put("국가4", "중국");
        lkMap.put("국가5", "일본");

        String testA1 = "a" ;
        String testA2 = "a" ;

        int hc1 = testA1.hashCode();
        int hc2 = testA2.hashCode();
    }
}
