public class Test {
    public static void main(String[] args) {
        //多态 面向接口编程
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.size());
        System.out.println(list);
        //遍历的方式 ArrayList 根据下标遍历   LinkedList 根据next()指针遍历
        //只写一个方法把所有集合都遍历了...
        Iterater iterater = list.iterator();
        while(iterater.hasNext()){
            System.out.println(iterater.next());
        }
    }
}
