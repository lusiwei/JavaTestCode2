package Stream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p=new Properties();
        try {
            p.load(new FileReader("day19_IO/src/Stream/p.properties"));
            System.out.println(p.getProperty("username"));
            System.out.println(p.getProperty("password"));
            System.out.println(p.getProperty("age"));
            System.out.println(p.stringPropertyNames());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
