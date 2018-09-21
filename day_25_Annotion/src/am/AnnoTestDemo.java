package am;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnoTestDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnoTest> annoTestClass=AnnoTest.class;
        System.out.println(annoTestClass.getAnnotations().length);
        System.out.println(annoTestClass.isAnnotationPresent(MyAnno.class));

        MyAnno anno=annoTestClass.getAnnotation(MyAnno.class);
        System.out.println(anno.name());
        Method method=annoTestClass.getMethod("print");
        System.out.println(method);
        try {
            method.invoke(new AnnoTest(),null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Arrays.asList(anno.animals()).forEach(x-> System.out.println(x));

    }
}
