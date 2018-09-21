
public class Demo1 {
    private static void doSomething(MyFunctionInterface inter) {
        inter.myMethod();//调用自定义的函数式接口方法
    }

    public static void main(String[] args){
        doSomething(()-> System.out.println("Lambda执行了！！！"));
    }
}
