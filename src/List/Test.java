package List;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list);
        list.add(1);
        list.add(3);
        System.out.println(list);
        list.addFirst(0);
        System.out.println(list);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.indexOf(3));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
