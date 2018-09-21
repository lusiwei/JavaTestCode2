package homework2;
/**
 * 用户信息表
 */

import java.util.HashMap;
import java.util.Map;

public class UsersInformations {

    static Map<String,String> userMap=new HashMap<>();

    public Map<String, String> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, String> userMap) {
        this.userMap = userMap;
    }
}
