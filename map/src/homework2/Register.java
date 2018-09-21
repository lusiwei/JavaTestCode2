package homework2;


import java.util.Scanner;

public class Register {
    UsersInformations usersInformations = new UsersInformations();

    //添加用户
    void register() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----欢迎进入注册页面-----");
            System.out.println("请输入用户名：");
            user.setName(scanner.next());
            System.out.println("请输入密码");
            user.setPassword(scanner.next());
            //判断用户名和密码是否合法
            //判断用户名
            if (JudgeUtil.judgeUserName(user) && JudgeUtil.judgePassword(user)) {
                if (usersInformations.getUserMap().containsKey(user.getName())) {
                    System.out.println("该用户已经存在！请直接登录");

                } else {
                    System.out.println("注册成功！！");
                    usersInformations.userMap.put(user.getName(), user.getPassword());
                    break;
                }
            } else {
                System.out.println("你输入的用户名或密码不合法！请重新输入！");
                System.out.println("警告：1.用户名长度10-13位,且必须包含数字与字母，2.密码长度大于10位且不能是纯数字");
            }
        }
    }


}
