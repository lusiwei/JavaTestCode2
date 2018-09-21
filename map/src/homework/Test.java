package homework;

import java.util.*;

import static java.util.Collections.sort;

public class Test {
    public static void main(String[] args) {
        //创建扑克对象
        Poker poker = new Poker();
        //组装54张扑克
        HashMap<Integer, String> pokers = poker.assemble();
        Set<Integer> keySet = pokers.keySet();
        System.out.println("未打乱前的数组为：");
        for (Integer s : keySet) {
            System.out.print(s + " : " + pokers.get(s) + " ");

        }

        //打乱54张牌
        ArrayList<Integer> keyArr = new ArrayList<>();
        for (Integer s : keySet) {
            keyArr.add(s);
        }
        //打乱key数组
        System.out.println();
        System.out.println("打乱后的数组为：");
        Collections.shuffle(keyArr);
        for (Integer s : keyArr) {
            System.out.print(pokers.get(s) + " ");
        }


        //创建玩家
        Player player1 = new Player("令狐冲", new ArrayList<>());
        Player player2 = new Player("石破天", new ArrayList<>());
        Player player3 = new Player("鸠摩智", new ArrayList<>());
        Player diPai= new Player("底牌", new ArrayList<>());

        //摸牌
        for (int i = 0; i < keyArr.size() ; i++) {
            if (i>=keyArr.size()-3){
                diPai.getCards().add(keyArr.get(i));
            }
            if (i % 3 == 1) {
                player1.getCards().add(keyArr.get(i));
            } else if (i % 3 == 2) {
                player2.getCards().add(keyArr.get(i));
            } else if (i % 3 == 0) {
                player3.getCards().add(keyArr.get(i));
            }
        }
        //冒泡排序player
        sort(player1.getCards());
        sort(player2.getCards());
        sort(player3.getCards());


        System.out.println();
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());
        System.out.println(diPai.toString());


    }
}
