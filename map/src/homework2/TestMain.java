package homework2;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
//        System.err.print("status:off-line");
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("1. 登录"+" "+"2. 注册"+"3.退出");
            System.out.println("(tips:输入1登录，输入2注册,输入3退出)");
            int input=scanner.nextInt();
            if(input==1){
                System.out.println("正在跳转登录页面。。。。");
                new Login().login();
                continue;
            }else if(input==2){
                System.out.println("正在跳转注册页面。。。。");
                new Register().register();
            }else {
                System.exit(0);
            }
        }

    }
}
