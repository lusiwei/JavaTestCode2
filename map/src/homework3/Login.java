package homework3;

import java.util.Scanner;

public class Login {


    //判断用户名是否存在,密码是否正确
    Boolean login(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String name=scanner.next();
            System.out.println("请输入密码：");
            String password=scanner.next();
            if (Teacher.teacherData.containsKey(name)&&Teacher.teacherData.get(name).equals(password)){
                    System.out.println("恭喜你登录成功！");
                    break;
            }else {
                System.out.println(name+","+password);
                System.out.println("用户名或密码不正确。请重新输入！");
                continue;
            }
        }
        return true;
    }

}
