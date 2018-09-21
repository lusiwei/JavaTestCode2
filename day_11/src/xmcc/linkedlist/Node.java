package xmcc.linkedlist;

public class Node {
    private Object data;//携带的数据 任何数据   object

    private Node next;//通过现在的结点 可以取到下一个结点

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
