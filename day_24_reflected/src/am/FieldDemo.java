package am;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class FieldDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Student> c=Student.class;
        Constructor<Student> constructor = c.getConstructor();
        Student student= constructor.newInstance();
        Field[] fields=c.getDeclaredFields();
        System.out.println("获得所有公有属性");
        Arrays.asList(fields).forEach(x-> System.out.println(x));

        Field name=c.getField("name");
        name.set(student,"张三");
        System.out.println(name);

    }
}
