package homework2;

/**
 * 判断用户名和密码是否合法的工具类
 */
public class JudgeUtil {
    //判断用户名是否合法
    static Boolean judgeUserName(User user) {
        char[] charName = user.getName().toCharArray();
        if (charName.length >= 10 && charName.length <= 13) {
            for (int i = 0; i < charName.length; i++) {
                if (charName[i] >= 48 && charName[i] <= 57 || charName[i] >= 65 && charName[i] <= 106 || charName[i] >= 97 && charName[i] <= 122) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    //判断密码是否合法
    static Boolean judgePassword(User user) {
        char[] charPassword = user.getPassword().toCharArray();
        if (charPassword.length > 10) {
            int n = 0;
            for (char c : charPassword) {
                if (c >= 48 && c <= 57) {
                    n++;
                }
            }
            if (n == charPassword.length) {
                return false;
            }
            return true;
        }
        return false;

    }
}
