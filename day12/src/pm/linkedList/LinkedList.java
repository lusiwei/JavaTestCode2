package pm.linkedList;

public class LinkedList<E> {

    Node head = null;
    Node lastNode = null;
    int index = 0;

    public void add(E e) {
        Node node = new Node(e, null);
        if (head == null) {
            head = node;
        } else {
            lastNode.setNext(node);
        }
        lastNode=node;
    }
    public void add(int index,Object obj){
        Node node=head;
        int i=0;
        while (node!=null){
            i++;
            node=node.getNext();
            if(i==index-1){

            }

        }
    }

    class Node {
        private Object data;
        private Node next;

        public Node() {
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
            index++;
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

}
