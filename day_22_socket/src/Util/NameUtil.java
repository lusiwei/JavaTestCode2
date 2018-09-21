package Util;

import java.util.Date;

public class NameUtil {
    //获取名字
    public static String getName(){
        String name="";
        StringBuffer sb=new StringBuffer("");
        for (int i = 0; i < 3; i++) {
           name+=(int)Math.random()*10;
        }
        name=name+new Date().getTime();
        return name;
    }

    public static void main(String[] args) {
        System.out.println(NameUtil.getName());
    }
}
