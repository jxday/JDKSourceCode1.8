package util;

import sun.misc.Unsafe;
import sun.reflect.Reflection;

import java.lang.reflect.Field;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName LinkedList
 * @create 2020-01-10 16:19
 * @Version 1.0.0
 */
public class LinkedList implements List {
    private static Unsafe unsafe = reflectGetUnsafe();
    private Integer length;
    private Integer next;

    public LinkedList() {
        this.length = 0;
        Node<Integer> node = new Node<Integer>();
    }

    @Override
    public String toString() {
        
        return "LinkedList:" + "length=" + length + "{" + "}";
    }

    private static Unsafe reflectGetUnsafe() {
        Unsafe unsafe = null;
        Field field = null;
        try {
            Class<?> callerClass = Reflection.getCallerClass();
            field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe =  (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unsafe;
    }
}
