package task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeUtil {
    /**
     * @param classPath
     * @param methodName
     * @return
     */
    //方法调用成功以后返回返回值
    public static Object invoke(String classPath,String methodName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       //获得类对象
       Class<?> c=Class.forName(classPath);
       Object o=c.getConstructor().newInstance();
       Method method=c.getDeclaredMethod(methodName);
       method.setAccessible(true);
       return method.invoke(o); //返回所调用方法的返回值
    }
}
