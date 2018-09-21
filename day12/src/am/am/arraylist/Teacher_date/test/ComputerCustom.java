package am.am.arraylist.Teacher_date.test;

import am.am.arraylist.ArrayList;

import java.util.Scanner;

public class ComputerCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer =null;
        ComputerUtil util = new ComputerUtil();//操作电脑的工具类
        ArrayList<Computer> list=null;
        int choice=0;
        while(true){
            System.out.println("请输入您的选择:");
            System.out.println("     1---添加计算机");
            System.out.println("     2---查询计算机（输入计算机编号、查出具体的某台计算机信息）:");
            System.out.println("     3---查询全部计算机信息");
            System.out.println("     4---退出系统");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    computer = new Computer();
                    System.out.println("输入cpu型号");
                    computer.setCpu(scanner.next());
                    System.out.println("请输入价格");
                    computer.setPrice(scanner.nextDouble());
                    util.addComputer(computer);
                    break;
                case 2:
                    System.out.println("请输入ID");
                    computer=util.queryById(scanner.nextInt());
                    if(computer==null){
                        System.out.println("没有该ID对应的电脑信息");
                    }else{
                        System.out.println(computer);
                    }
                    break;
                case 3:
                    list = util.queryAll();
                    if(list.size()==0){
                        System.out.println("当前没有电脑,请去添加");
                    }else{
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("谢谢使用,再见");
                    System.exit(0);

            }
        }
    }
}
