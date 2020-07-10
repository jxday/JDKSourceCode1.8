package util;

/**
 * 〈链表结构的节点〉
 *
 * @author cty
 * @ClassName Node
 * @create 2020-01-10 16:17
 * @Version 1.0.0
 */
public class Node<T>{
    private T data;
    private Integer next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }
}
