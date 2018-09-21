package am;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {
    private Object jack;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student student=new Student();
        Class<? extends Student> c = student.getClass();
        System.out.println("获得公有的无参普通成员方法");
        Method print1=c.getMethod("print1");
        System.out.println(print1);
        //调用
        Object invoke = print1.invoke(student, null);
        System.out.println("没有返回值得方法结果为："+invoke);
        System.out.println("无参普通方法的方法名为："+print1.getName());


        System.out.println("获得公有的有参构造方法");
        Method print2=c.getMethod("print2",String.class,int.class);
        Object invoke2=print2.invoke(student,"jack",22);
        System.out.println("获得公有的有参构造方法结果为"+invoke2);
    }
}
