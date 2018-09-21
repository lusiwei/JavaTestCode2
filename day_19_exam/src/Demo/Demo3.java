package Demo;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        //map.entry方式
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey()+","+s.getValue());
        }
        //lambda表达式
        System.out.println("-------------");
        map.entrySet().forEach(s-> System.out.println(s.getKey()+"****"+s.getValue()));

        System.out.println("-------------");

        //keySet 方式
        map.keySet().forEach(k-> System.out.println(map.get(k)+"----"+k));
        System.out.println("-------------");

        //values 方式
        map.values().forEach(v -> System.out.println(v));

    }
}
