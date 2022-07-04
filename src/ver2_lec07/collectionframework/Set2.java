package ver2_lec07.collectionframework;

import java.util.HashSet;
import java.util.concurrent.Phaser;

public class Set2 {
    //set 자료를 중복하여 입력 x
    // key val 구조

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet.toString());
    }
}
