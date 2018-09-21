package AnnotationTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class My {
    //测试的方法，把异常写到日志中
    public static void testMethod(String classPath){
        int num=0;
        try {
            Class c=Class.forName(classPath);
            Constructor constructor=c.getConstructor(Method.class);
            Object o=constructor.newInstance();

            Method[] methods=c.getDeclaredMethods();
            Arrays.asList(methods).forEach(method -> {
                if(method.isAnnotationPresent(MyAnno.class)){
                    try {
                        method.invoke(o,6,6);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (Exception e){
                        num++;
                        try {
                            BufferedWriter bw=new BufferedWriter(new FileWriter("day_25_Annotion/log.txt"));
                            bw.write("出现异常方法的名字："+method.getName());
                            bw.newLine();
                            bw.write(e.getCause().getMessage());
                            bw.newLine();
                            bw.write("*******************");
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
