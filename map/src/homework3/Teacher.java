package homework3;

import java.util.*;

public class Teacher {
    private String username;
    private String password;
    private int phoneNumber;
    static Map<String, String> teacherData = new HashMap<>();

    public Teacher() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //增加学生
    boolean addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要增加的学生姓名：");
        String name = scanner.next();
        System.out.println("请输入要增加的学生密码：");
        String password = scanner.next();
        System.out.println("请输入要增加的学生电话: ");
        String phoneNumber = scanner.next();
        Student.stuList.add(new Student(name, password, phoneNumber));
        return true;
    }

    //删除学生
    boolean deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的学生id");
        int id = scanner.nextInt();
        for (Student stu : Student.stuList) {
            //判断要删除的学生是否存在
            if (stu.getsId() == id) {
                Student.stuList.remove(stu);
                System.out.println("删除成功！你刚才删除了" + stu.getUsername());
                return true;
            }
        }
        System.out.println("该学生不存在，删除失败！");
        return false;
    }

    //修改学生信息
    void changeStuData() {
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("请输入你要修改的学生的id:");
            int id = scanner.nextInt();
            //判断该id是否存在
            for (Student student : Student.stuList) {
                if (student.getsId() == id) {
                    System.out.println("请选择你要修改的信息：1. 姓名 2. 密码 3.电话 4. 退出");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("请输入新的姓名:");
                            String name = scanner.next();
                            student.setUsername(name);
                            break;
                        case 2:
                            System.out.println("请输入新的密码：");
                            String password = scanner.next();
                            student.setPassword(password);
                            break;
                        case 3:
                            System.out.println("请输入新的电话");
                            String phoneNumber = scanner.next();
                            student.setPhoneNumber(phoneNumber);
                            break;
                        case 4:
                            flag=false;

                        default:
                            System.out.println("无效指令，请重新输入");
                            break;
                    }
                }

            }
            System.out.println("你选择的学生不存在，请重新选择");
        }
    }

    //查看所有学生
    void printStu() {
        for (Student student : Student.stuList) {
            System.out.println(student.toString());
        }
    }

    //根据姓查找学生，模糊查找
    void searchStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的姓：");
        String name = scanner.next();
        for (Student student : Student.stuList) {
            if (student.getUsername().charAt(0) == name.charAt(0)) {
                System.out.println("查找到的学生为");
                System.out.println(student.toString());
            }
        }
    }

    //随机选5个学生打扫除
    void selectStu() {
        Set<Student> fiveStu = new HashSet<>();
        while (true) {
            int n = 0;
            for (int i = 0; i < Student.stuList.size(); i++) {
                int random = (int) Math.random() * Student.stuList.size();
                if (i == random) {
                    if (fiveStu.add(Student.stuList.get(i))) {
                        n++;
                    } else {
                        continue;
                    }
                }
            }
            if (n == 5) {
                break;
            }
        }
    }
}
