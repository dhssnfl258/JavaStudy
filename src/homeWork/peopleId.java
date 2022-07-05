package homeWork;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class peopleId {
    public static void main(String[] args) {
//        Random r = new Random();
//        System.out.println(r);
//        int a = r.nextInt(10);
//        System.out.println(a);
        Scanner in = new Scanner(System.in);
        HashMap<String, String> user = new HashMap<String,String>();
        peopleId id = new peopleId();

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        user.put("year",in.next());
        System.out.print("출생도를 입력해 주세요.(mm):");
        user.put("month",in.next());
        System.out.print("출생일을 입력해 주세요.(dd):");
        user.put("date",in.next());
        System.out.print("성별을 입력해 주세요.(m/f):");
        user.put("sex",in.next());
        System.out.println(id.prefixNum(user));
        System.out.println(id.suffixNum(user));
        System.out.println(id.pId(user));
    }
/**
 * @param user : HashMap
 * @return prefixNumber:String
 * */
    public String prefixNum(HashMap user){
        return user.get("year").toString().substring(2)+user.get("month").toString()+user.get("date");
    }
    /**
    * @param user:hashMap
    * @return suffixNumber:String
     *
    * */
    public String suffixNum(HashMap user){
        StringBuffer suff = new StringBuffer();
        Random r = new Random();
        int year = Integer.parseInt((String) user.get("year"));


        if(year <2000){
            suff.append( "m".equals(user.get("sex")) ? "1" : "2" );
        }
        else{
            suff.append( "m".equals(user.get("sex")) ? "3" : "4" );
        }
        for(int i = 0 ; i <6; i++){
            suff.append(r.nextInt(10));
        }
        return suff.toString();
    }

    public String pId(HashMap user){
        return prefixNum(user) + "-" + suffixNum(user);
    }
}
