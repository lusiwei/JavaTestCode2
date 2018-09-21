package xmcc.linkedlist;

public class NodeTest {
    public static void main(String[] args) {
        //创建结点  就是一个链表    链表中只有一个节点 那么应该指向null
        Node node1 = new Node("链表节点一。。。",null);//单节点

        Node node2 = new Node("链表节点二。。。",null);//单节点

        Node node3 = new Node("链表节点三。。。",null);//单节点

        Node node4 = new Node("链表节点四。。。",null);//单节点

        //把节点整合在一起就是一个链表   node1---->node2---->node3---->node4
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        //遍历链表    知道头节点

    }
}
