import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class testMap {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("黄晓明","Angelababy");
        map.put("汪峰","章子怡");
        map.put("周杰伦","昆凌");
        System.out.println(map);
        System.out.println(map.get("周杰伦"));

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+"===="+map.get(key));
        }
        System.out.println(map.remove("汪峰"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("周杰伦"));
        Collection<String> mValue= map.values();
        for (String s : mValue) {
            System.out.println(s);
        }
    }
}
