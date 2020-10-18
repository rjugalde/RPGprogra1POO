package RPG;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private ArrayList<Item> items;
    private double money;

    public Player(){
        items = new ArrayList<Item>();
        money = 20;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void getItems(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
