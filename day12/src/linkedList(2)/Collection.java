//集合总接口
public interface Collection<E> {
    //添加方法 用这个
    void add(E e);
    //用来统计长度
    int size();
    //我只知道 iterater这个接口可以完成遍历
    //给所有集合一个iterater的实现对象 就可以完成遍历
    Iterater<E> iterator();
}
