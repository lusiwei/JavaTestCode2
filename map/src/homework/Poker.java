package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {


    public static HashMap<Integer, String> assemble() {
        String[] pokerNumber = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] King = {"大王", "小王"};
        String[] color = {"♥", "♦", "♣", "♠"};
//       ArrayList<String> poker=new ArrayList<>();
        HashMap<Integer, String> poker = new HashMap<>();
        int n = 1;
        for (int i = 0; i < pokerNumber.length; i++) {
            for (int j = 0; j < color.length; j++) {
                poker.put(n , color[j] + pokerNumber[i]);
                n++;
            }
        }
        poker.put(54, King[0]);
        poker.put(53, King[1]);
        return poker;
    }

    public ArrayList<Integer> shuffle(ArrayList<Integer> arrayList) {
        Collections.shuffle(arrayList);
        System.out.println("打乱后的数组为：");
        for (Object o : arrayList) {
            System.out.print(o +" ");

        }
        return arrayList;
    }
    public ArrayList<Integer> sort(ArrayList<Integer> keyArr){
        Integer temp;
        for (int i = 0; i < keyArr.size(); i++) {
            for (int j=0;i<keyArr.size()-i-1;j++){
                if ((keyArr.get(j)>keyArr.get(j+1))){
                    temp=keyArr.get(j);
                    keyArr.add(j,keyArr.get(j+1));
                    keyArr.add(j+1,temp);

                }
            }

        }
        return keyArr;
    }

}
