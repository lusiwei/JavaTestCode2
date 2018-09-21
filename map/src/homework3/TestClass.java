package homework3;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        while (true) {
            System.out.println("请选择：1. 注册 2. 登录 3. 退出");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    //老师注册
                    new Register().judgeExists(t1);
                    break;
                case 2:
                    new Login().login();
                    Boolean flag=true;
                    while (flag) {
                        System.out.println("请选择： 1. 增加学生 2. 删除学生 3. 修改学生信息 4. 查看学生 5. 根据姓查看学生 6 .随机选5个人大扫除");
                        Scanner scanner1 = new Scanner(System.in);
                        int option1 = scanner1.nextInt();
                        switch (option1) {
                            case 1:
                                t1.addStudent();
                                break;
                            case 2:
                                t1.deleteStudent();
                                break;
                            case 3:
                                t1.changeStuData();
                                break;
                            case 4:
                                t1.printStu();
                                break;
                            case 5:
                                t1.searchStu();
                                break;
                            case 6:
                                t1.selectStu();
                                flag=false;
                                break;
                            default:
                                System.out.println("指令不存在请重新选择！");
                                continue;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}
