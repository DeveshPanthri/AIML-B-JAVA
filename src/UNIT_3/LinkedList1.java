package UNIT_3;
 import java.util.Iterator;
 import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList <String>list = new LinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.remove("Third");
            list.addFirst("First");
            list.addLast("Fifth");
        }

    }
}
