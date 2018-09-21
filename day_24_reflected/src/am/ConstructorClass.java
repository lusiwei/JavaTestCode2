package am;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c=Class.forName("am.Student");
        //获得共有无参构造
        System.out.println(c.getConstructor());
        //获得公有的有参构造
        Constructor constructor=c.getConstructor(String.class,int.class);
        System.out.println(constructor);
        System.out.println(constructor.newInstance("张三", 22));
        //获得私有的构造方法
        Constructor constructor1=c.getDeclaredConstructor(int.class);
        constructor1.setAccessible(true);
        System.out.println(constructor1.newInstance(23));

        //获得所有的公有构造方法
        System.out.println("获得所有的公有的构造方法");
        Constructor[] constructor2=c.getConstructors();
        Arrays.asList(constructor2).forEach(cc-> System.out.println(cc));
        //获得所有的包括私有构造方法
        System.out.println("获得所有的包括私有的构造方法");
        Constructor[] constructors4=c.getDeclaredConstructors();
        Arrays.asList(constructors4).forEach(cc-> System.out.println(cc));

    }
}
