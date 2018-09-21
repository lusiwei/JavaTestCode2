package ExceptionDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        setAge(200);
        parse("2017-01-01");
    }
    public static void setAge(int age){
        if (age<0||age>150){
            throw new RuntimeException("年龄不合法");
        }

    }
    private static Date parse(String str){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(str);
    }
}
