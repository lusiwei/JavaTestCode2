package Test_Question;

/**
 * 单例模式饿汉式
 */
public class SingleTon {
    private static SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) return new SingleTon();
            }
        }
        System.out.println("已经有了一个实例");
        return singleTon;
    }
}
