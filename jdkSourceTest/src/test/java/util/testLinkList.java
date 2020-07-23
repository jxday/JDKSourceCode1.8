package util;

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
}
