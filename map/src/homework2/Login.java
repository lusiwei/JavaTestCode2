package homework2;

import java.util.Scanner;

public class Login {

    //判断Map中是否有该用户
    void login(){
        User user=new User();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("-----欢迎进入登录页面-----");
            System.out.println("请输入用户名");
            user.setName(scanner.next());
            System.out.println("请输入密码：");
            user.setPassword(scanner.next());
            if(UsersInformations.userMap.containsKey(user.getName())){
                if(UsersInformations.userMap.containsValue(user.getPassword())){
                    System.out.println("-----登录成功----");
                    System.out.println("---------------------------------------------------");
                    System.out.println("|                                                 |");
                    System.out.println("❀❀❀❀❀❀❀❀❀❀❀ 欢迎来到仙桃国际数据谷❀❀❀❀❀❀❀❀❀❀❀");
                    System.out.println("|                                                 |");
                    System.out.println("---------------------------------------------------");
                    System.out.println(" __      __       .__                                  __           ____  ___                     \n" +
                            "/  \\    /  \\ ____ |  |   ____  ____   _____   ____   _/  |_  ____   \\   \\/  / _____   ____  ____  \n" +
                            "\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\  \\   __\\/  _ \\   \\     / /     \\_/ ___\\/ ___\\ \n" +
                            " \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/   |  | (  <_> )  /     \\|  Y Y  \\  \\__\\  \\___ \n" +
                            "  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >  |__|  \\____/  /___/\\  \\__|_|  /\\___  >___  >\n" +
                            "       \\/       \\/          \\/            \\/     \\/                       \\_/     \\/     \\/    \\/ ");
                    break;
                }else{
                    System.out.println("密码错误！你还有三次重试的机会");
                }
            }else{
                System.out.println("没有此用户请注册之后再来登录");
                System.out.println("正在跳转注册页面。。。。。");
                new Register().register();
            }
        }
    }
}
