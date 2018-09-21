import java.util.Iterator;
import java.util.LinkedList;

/**
 * JDK的
 * linkedList
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //添加元素 添加到末尾
        list.add(1);
        list.add(2);
        list.add(3);
        list.addLast(4);
        System.out.println(list);
        //添加到头
        list.addFirst(0);
        System.out.println(list);
        //添加到指定位子  后面的元素 向后移
        list.add(2,9);
        System.out.println(list);
        //替换指定位子的值
        list.set(3,10);
        System.out.println(list);
        System.out.println("获得第一个元素"+ list.getFirst());
        System.out.println("获得最后元素"+ list.getLast());
        System.out.println("移出最后一个元素"+list.removeLast());
        System.out.println("移出第一个元素"+list.removeFirst());
        System.out.println(list);
        System.out.println("获得长度"+list.size());
        System.out.println("查看链表中是否包含元素"+list.contains(1));
        System.out.println("循环获得下标的元素为");
        //遍历方式:1
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+"   ");//根据下标获得链表中的元素
        }
        //2. for(Integer i : linkedList);
        //3.迭代器
    }
}
