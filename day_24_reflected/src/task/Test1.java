package task;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Test1{
    String classPath;
    String methodName;

    @Before
    public void  loadProperties() throws IOException {
        Properties properties=new Properties();
        InputStream is=Test1.class.getClassLoader().getResourceAsStream("task/Reflected.properties");
        properties.load(is);
        classPath=properties.getProperty("classPath");
        methodName=properties.getProperty("methodName");
        is.close();
    }

    @Test
    public void invoke() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        InvokeUtil.invoke(classPath,methodName);
    }
}
