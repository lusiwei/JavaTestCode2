package Test_Question;

public class ReverseListNode {
    public static void main(String[] args) {
        Node node1 = new Node("节点1", null);
        Node node2 = new Node("节点2", null);
        Node node3 = new Node("节点3", null);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println(reverseLinkedList(node1));
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.getNext() == null) return head;
        Node pre = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = temp;
        }
        head = pre;
        return head;
    }
}

class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
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

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
