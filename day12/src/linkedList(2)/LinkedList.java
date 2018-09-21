public class LinkedList<E> implements Collection<E>{
     Node headNode;//头节点
     Node lastNode;//尾节点
     int index;
    public void add(E e){//E代表数据  添加在链表末尾
        //创建节点
        Node node = new Node(e,null);
        if(headNode==null){
            headNode=node;//当一个节点都没有的时候加入的节点就是头结点与尾节点
        }else{//说明链表中已经存在节点了
            lastNode.setNext(node);//1-->2-->3   4   3--->4  1-->2-->3 ---->4
        }
        lastNode = node;
        index++;
    }
    public void add(int index,E e){//a-->b--->c--->null
        Node node = new Node(e,null);//创建节点
       if(index>this.index||index<0){
           //抛异常
           throw new IndexOutOfBoundsException("下标越界");
       }else if(this.index==0){//当前链表为null 插入第一个
           headNode = node;
           lastNode = node;
       }else if(index==this.index){//插入到末尾
            lastNode.setNext(node);
            lastNode=node;
       }else{
           Node preNode=headNode;
           for (int i = 1; i < index; i++) {
               preNode = preNode.getNext();//第一位
           }
           node.setNext(preNode.getNext());//新加进来的指向第二位
           preNode.setNext(node);//第一位指向新加进来的
       }
       this.index++;
    }
    public int size(){
        return index;
    }

    //简单弄一个可以 查看链表

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Node node = headNode;
        while(node!=null){//遍历
            sb.append(node.getData()+",");
            node = node.getNext();
        }
       return "["+sb+"]";
    }

    class Node{//内部类 就是节点

        private Object data;//装的数据
        private Node  next;//指向下一个的指针
        public Node() {
        }

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

    }
    @Override
    public Iterater<E> iterator() {
        return new LinkedListIterator();
    }
    class LinkedListIterator implements  Iterater<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}

