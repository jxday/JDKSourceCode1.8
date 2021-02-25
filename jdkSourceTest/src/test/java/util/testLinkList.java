package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName testLinkList
 * @create 2020-01-10 16:53
 * @Version 1.0.0
 */
public class testLinkList {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.peek();
//        queue.add("111");
//        queue.poll();
//        queue.add("111");
//        queue.add("222");
//        queue.peek();
//        queue.poll();
        System.out.println(queue.size());
    }

    public static void teat2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.println(s);
        }

        System.err.println("============");
        ListIterator<SObjtring> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.err.println("============");
        Iterator<String> stringIterator = list.descendingIterator();
        for (String s : list) {
            System.out.println(s);
        }

    }
}
