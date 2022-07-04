package ver2_lec07.collectionframework;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("alpha");
        linkedList.add("bravo");
        linkedList.add("charlie");
        linkedList.add("delta");
        linkedList.add("echo");

        System.out.println(linkedList.toString());

        linkedList.add(1,"good");
        System.out.println(linkedList.toString());
    }
}
