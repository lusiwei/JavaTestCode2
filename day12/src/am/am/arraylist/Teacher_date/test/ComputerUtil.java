package am.am.arraylist.Teacher_date.test;

import am.am.arraylist.ArrayList;

public class ComputerUtil {
    private ArrayList<Computer> list = new ArrayList<>();

    /**
     * 添加计算机
     * @param computer
     */
    public void addComputer(Computer computer){
        list.add(computer);
    }
    //输入编号查询计算机
    public Computer queryById(int id){
       if(!(list.size()==0)){//没有电脑的数据
           for (int i = 0; i < list.size(); i++) {
               if(list.get(i).getId()==id){
                   return list.get(i);
               }
           }
       }
       return null;//表示没有查到电脑
    }
    //查询所有的计算机信息
    public ArrayList<Computer> queryAll(){
        return list;
    }
}
