package am.am.arraylist.homework;

import am.am.arraylist.ArrayList;

import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args) {
        ArrayList<Computer> cList=new ArrayList<>();
        cList.add(new Computer(1,"intel_i7","华硕",1000,8,"AMD",4500));
        cList.add(new Computer(2,"intel_i9","华硕",1000,8,"NVIDIA",5000));
        cList.add(new Computer(3,"intel_i5","华硕",1000,8,"AMD",4500));
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入电脑编号：");
        int in=scanner.nextInt();
        for (int i = 0; i < cList.size(); i++) {
            if(in==cList.get(i).getId()){
                System.out.println("该电脑cpu型号 "+cList.get(i).getCpuType()+
                        " 主板型号："+ cList.get(i).getMainboardType()+
                        " 硬盘大小为"+ cList.get(i).getSize()+"GB "+
                        " 内存为:"+cList.get(i).getMemory()+"GB "+
                        " 显卡为"+cList.get(i).getGraphicCardType()+
                        " 价格为："+cList.get(i).getPrice());
            }
        }

        for (int i = 0; i < cList.size(); i++) {
            System.out.println("编号为"+i+"的电脑cpu型号 "+cList.get(i).getCpuType()+
                    " 主板型号："+ cList.get(i).getMainboardType()+
                    " 硬盘大小为"+ cList.get(i).getSize()+"GB "+
                    " 内存为:"+cList.get(i).getMemory()+"GB "+
                    " 显卡为"+cList.get(i).getGraphicCardType()+
                    " 价格为："+cList.get(i).getPrice());

        }
    }
}
