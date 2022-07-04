package ver2_lec07.collectionframework;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList sampleList = new ArrayList();

        sampleList.add(1);
        sampleList.add("korea");
        sampleList.add(true);
        System.out.println(sampleList.toString());

        int sampleSize = sampleList.size();

        for(int i = 0 ; i < sampleSize ; i++){
            Object o = sampleList.get(i);
            System.out.println("Object :::" + o);
        }
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        for(int i = 0; i<integerArrayList.size(); i++){
            Integer getInt = integerArrayList.get(i);
            System.out.println(i + "번쨰 getInt :" + getInt);
        }

    }
}
