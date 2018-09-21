package pm.demo;
//单例模式
public class SingleDemo {
    private static SingleDemo singleDemo=null;

    private SingleDemo(){

    }
    public static SingleDemo getInstance(){
        if (singleDemo==null){
            synchronized(SingleDemo.class){
                if (singleDemo==null){
                    singleDemo=new SingleDemo();
                }
            }
        }
        return singleDemo;
    }
}
