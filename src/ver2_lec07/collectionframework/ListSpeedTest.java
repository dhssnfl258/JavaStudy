package ver2_lec07.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest {
    public static void main(String[] args) {

        long startMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();

        for (int i = 0 ; i < 1000000 ; i ++){
            arrayList.add(i);
        }

        long endMillis = System.currentTimeMillis();
        long diffMillis = endMillis - startMillis;

        System.out.println("차이 :" + diffMillis);

        startMillis = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();

        for( int i = 0 ; i < 1000000 ; i++){
            linkedList.add(i);
        }
        endMillis = System.currentTimeMillis();
        diffMillis = endMillis - startMillis;
        System.out.println("차이 linkedList ::: " + diffMillis);

    }
}
