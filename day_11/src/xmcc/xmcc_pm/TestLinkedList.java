package xmcc.xmcc_pm;

public class TestLinkedList {
    public static void main(String[] args) {
        Node node1=new Node("我是linkedlist1 里面的内容",null);// 单节点
        Node node2=new Node("我是linkedlist2 里面的内容",null);
        Node node3=new Node("我是linkedlist3 里面的内容",null);
        Node node4=new Node("我是linkedlist4 里面的内容",null);
        Node node5=new Node("我是linkedlist5 里面的内容",null);
        Node node6=new Node("我是linkedlist6 里面的内容",null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);


//        while (node!=null){
//            System.out.println(node);
//            node=node.getNext();
//        }
        //遍历链表
//        Node node=node1;
//        do{
//            System.out.println(node);
//            node=node.getNext();
//        }while (node!=null);

        Node nodeN=reverseLinkedList(node1);
        Node nodeY=nodeN;
        do{
            System.out.println(nodeY);
            nodeY=nodeY.getNext();
        }while (nodeY!=null);

    }
    private static Node reverseLinkedList(Node head){
        Node node=head;
        Node nodeN;
        int length=0;
        while (node!=null){
            length++;
            node=node.getNext();
        }
        nodeN=node;
        node=head;
        Node nodeX=nodeN;
        int j=0;
        while (node!=null){
            j++;
            node=node.getNext();
            int i=1;
            if(j==length-i){
                nodeX.setNext(node);
                nodeX=nodeX.getNext();
                i++;
            }
        }
        return nodeN;
    }
}
