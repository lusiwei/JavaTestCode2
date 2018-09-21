package homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    private String name;
    private ArrayList<Integer> cards;

    public Player(String name, ArrayList<Integer> cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Integer> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        HashMap<Integer, String> map =Poker.assemble();
        String s = "";
        for (int i = 0; i < cards.size(); i++) {
            s+=map.get(cards.get(i))+",";
        }
        return name+":["+s+"]";
    }
}
