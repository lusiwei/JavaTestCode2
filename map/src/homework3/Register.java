package homework3;

import java.util.Scanner;

public class Register {

    //判断Teacher_Data中是否已经存在该教师
    Boolean judgeExists(Teacher teacher){
        while (true){
            if(Teacher.teacherData.containsKey(teacher.getUsername())){
                System.out.println("用户名已经存在，请直接登录！");
            }else{
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入用户名：");
                String name=scanner.next();
                System.out.println("请输入密码：");
                String password=scanner.next();
                Teacher.teacherData.put(name,password);
                System.out.println("注册成功");
                break;
            }
        }
        return false;
    }
}
